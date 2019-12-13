package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<User, List<Account>> database = new HashMap<>();

    public void addUser(User user) {
        database.put(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        database.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        List<Account> list = new ArrayList<>();
        list.add(account);
        for (User key : database.keySet()) {
            if (key.getPasport().equals(passport)) {
                database.put(key, list);
            }
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        for (User key : database.keySet()) {
            if (key.getPasport().equals(passport)) {
                database.remove(account);
            }
            }
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> list = new ArrayList<>();
        for (Map.Entry<User, List<Account>> entry : database.entrySet()) {
            if (entry.getKey().getPasport().equals(passport)) {
                list = entry.getValue();
            }
        }
        return list;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Account a = new Account();
        Account b = new Account();
        List<Account> srsAccount = getUserAccounts(srcPassport);
        List<Account> dstAccount = getUserAccounts(destPassport);
        if (srsAccount == null && srsAccount.get(0).getValue() < amount) {
            return false;
        }
        a.setValue(srsAccount.get(0).getValue() - amount);
        b.setValue(dstAccount.get(0).getValue() + amount);
        return true;
    }

    public static void main(String[] args) {
        Bank test = new Bank();
        User a = new User("Misha", "12BB");
        User b = new User("Vasya", "12QQ");
        Account c = new Account(8000, "4513FF");
        Account d = new Account(6000, "3218RR");
        test.addUser(a);
        test.addUser(b);
        test.addAccountToUser("12BB", c);
        test.addAccountToUser("12QQ", d);
        test.deleteAccountFromUser("12BB", c);
        test.getUserAccounts("12BB");
        test.transferMoney("12BB", "4513FF", "12QQ", "3218RR", 2000);

    }
}

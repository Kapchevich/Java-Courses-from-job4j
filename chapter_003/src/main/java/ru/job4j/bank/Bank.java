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
        for (User key : database.keySet()) {
            if (key.getPasport().equals(passport)
            && database.get(key).indexOf(account) == -1) {
                database.get(key).add(account);
                break;
            }
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : database.entrySet()) {
            if (entry.getKey().getPasport().equals(passport)) {
                for (int index = 0; index < entry.getValue().size(); index++) {
                    if (entry.getValue().get(index).equals(account)) {
                            database.get(entry.getKey()).remove(index);
                    }
                }
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

    public Account getUserAccounts(String passport, String requisite) {
        for (Map.Entry<User, List<Account>> entry : database.entrySet()) {
            for (int index = 0; index < entry.getValue().size(); index++) {
            if (entry.getKey().getPasport().equals(passport)
            && entry.getValue().get(index).getRequisites().equals(requisite)) {
                return entry.getValue().get(index);
            }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Account srsAccount = getUserAccounts(srcPassport, srcRequisite);
        Account dstAccount = getUserAccounts(destPassport, dstRequisite);
        if (srsAccount == null || dstAccount == null
                || srsAccount.getRequisites() != srcRequisite
                || srsAccount.getValue() < amount
                || dstAccount.getRequisites() != dstRequisite) {
            return false;
        }
        return srsAccount.transfer(srsAccount, dstAccount, amount);
    }
}


package bank;
import org.junit.Test;
import ru.job4j.bank.Account;
import ru.job4j.bank.Bank;
import ru.job4j.bank.User;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BankTest {
        @Test
        public void transfer () {
                Bank bank = new Bank();
                User srsUser = new User("Misha", "12QQ");
                User dstUser = new User ("Anton", "12RR");
                Account srsAccount = new Account(14000, "4513FF");
                Account dstAccount = new Account(6000, "3218RR");
                bank.addUser(srsUser);
                bank.addUser(dstUser);
                bank.addAccountToUser("12QQ", srsAccount);
                bank.addAccountToUser("12RR", dstAccount);
                boolean a = bank.transferMoney("12QQ", "4513FF", "12RR", "3218RR", 2000);
                assertThat(a, is(true));
        }
        @Test
        public void transferIfNotEnoughMoney () {
                Bank bank = new Bank();
                User srsUser = new User("Misha", "12QQ");
                User dstUser = new User ("Anton", "12RR");
                Account srsAccount = new Account(14000, "4513FF");
                Account dstAccount = new Account(6000, "3218RR");
                bank.addUser(srsUser);
                bank.addUser(dstUser);
                bank.addAccountToUser("12QQ", srsAccount);
                bank.addAccountToUser("12RR", dstAccount);
                boolean a = bank.transferMoney("12QQ", "4513FF", "12RR", "3218RR", 50000);
                assertThat(a, is(false));
        }
}


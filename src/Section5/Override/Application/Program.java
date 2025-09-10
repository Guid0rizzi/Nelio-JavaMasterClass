package Section5.Override.Application;

import Section5.Entities.Account;
import Section5.Entities.BusinessAccount;
import Section5.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account sac = new SavingsAccount(123, "Leonardo", 1000.0, 5000.0);
        sac.withdraw(100.00);
        Account acc = new Account(123, "Leonardo", 1000.0);
        acc.withdraw(100.00);
        System.out.println(sac.getBalance());
        System.out.println(acc.getBalance());
        Account bac = new BusinessAccount(123, "Leonardo", 1000.0, 5000.0);
        bac.withdraw(200.00);
        System.out.println(bac.getBalance());
    }
}

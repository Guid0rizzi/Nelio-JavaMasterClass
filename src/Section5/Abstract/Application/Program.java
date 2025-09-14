package Section5.Abstract.Application;

import Section5.Abstract.Entities.Account;
import Section5.Abstract.Entities.BusinessAccount;
import Section5.Abstract.Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 600.00, 0.01));
        list.add(new BusinessAccount(1002, "Marty", 600.00, 700.0));
        list.add(new SavingsAccount(1003, "Leo", 600.00, 0.01));
        list.add(new BusinessAccount(1005, "Ro", 600.00, 700.0));
        Double sum = 0.0;
        for(Account c: list){
            sum += c.getBalance();
        }
        System.out.println(sum);
        for(Account c: list){
           Double balances =  c.getBalance() +10.0;
           System.out.println(balances);
        }
    }
}

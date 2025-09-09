package Section5.UpcastingAndDownCasting.application;

import Section5.Entities.Account;
import Section5.Entities.BusinessAccount;
import Section5.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(150, "Leonardo", 0.0);
        BusinessAccount bacc = new BusinessAccount(124, "Ana", 0.50, 150.0);
        //UPCASTING
        Account acc0 = bacc;
        Account acc1 = new BusinessAccount(125, "João", 0.40, 160.0);
        Account acc2 = new SavingsAccount(125, "Maria", 0.40, 160.0);

        //DOWNCASTING
        //BusinessAccount acb = acc1;//erro
        BusinessAccount acb1 = (BusinessAccount)acc1;

       // BusinessAccount acb2 = (BusinessAccount) acc2;// isso não vai dar erro agora, mas quando compilar vai, porque
        // o cc2 é do tipo SavingsAccount não do tipo BusinessAccount

        if(acc2 instanceof BusinessAccount){
            BusinessAccount acb2 = (BusinessAccount) acc2;
            acb2.loan(200);
        }

        if(acc2 instanceof SavingsAccount){
            SavingsAccount acb2 = (SavingsAccount) acc2;
            acb2.updateBalance();
            System.out.println("Updated");
        }

    }
}

package Section6.Exercise.Application;

import Section6.Exercise.Model.Entities.Account;
import Section6.Exercise.Model.Entities.BusinessException;

import java.text.ParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number, holder, initialBalance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            Double withdrawQuantity = sc.nextDouble();
            acc.withdraw(withdrawQuantity);
        } catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}

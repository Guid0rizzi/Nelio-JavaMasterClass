package Section1.StaticsMembers;

import Section1.StaticsMembers.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats the dolar price?");
        double dolar = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dolarQuantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais");
        System.out.println(CurrencyConverter.dolarConverter(dolar, dolarQuantity));
    }
}

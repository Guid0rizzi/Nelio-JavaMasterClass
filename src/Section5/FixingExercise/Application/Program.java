package Section5.FixingExercise.Application;

import Section5.FixingExercise.Entities.Person;
import Section5.FixingExercise.Entities.PhysicalPerson;
import Section5.FixingExercise.Entities.PrivatePerson;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int number =  sc.nextInt();
        for(int i = 0; i< number; i++){
            System.out.println("Tax payer #"+(1+i)+" data");
            System.out.print("Individual or comany(i/c)?");
            char x = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (x == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Person p = new PhysicalPerson(name, anualIncome, healthExpenditures);
                list.add(p);
            }else{
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();
                Person p = new PrivatePerson(name, anualIncome, employeesNumber);
                list.add(p);
            }


        }
        System.out.println();
        for(Person p: list){
            System.out.println(p.getName()+": $ "+p.tax());
        }
        System.out.println();
        Double sum = 0.0;
        for(Person p: list){
            sum += p.getAnualIncome();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + sum);
    }
}

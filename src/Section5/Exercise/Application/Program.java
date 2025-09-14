package Section5.Exercise.Application;

import Section5.Exercise.Entities.Employee;
import Section5.Exercise.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Employee> list = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        Integer number = sc.nextInt();
        for(int i = 0; i< number; i++){
            System.out.println("Employee #"+(i+1)+" data" );
            System.out.print("OutSourced(y/n)?: ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHours = sc.nextDouble();
            if (ch == 'y'){
                System.out.println("Addicional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            }else{
                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }


        }
        System.out.println("Payments");
        for (Employee emp: list){
            System.out.println(emp.getName()+"- $ "+ emp.payment());
        }

    }
}

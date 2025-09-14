package Section5.AbstractMethods.Application;

import Section5.AbstractMethods.Entities.Circle;
import Section5.AbstractMethods.Entities.Retangle;
import Section5.AbstractMethods.Entities.Shape;
import Section5.AbstractMethods.Enum.Color;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter the number of shapes");
        ArrayList<Shape> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            System.out.println("Shape #"+ i +" data:");
            System.out.print("Rectangle or Circle(r/c)? ");
            char x = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            if(x =='r'){
                System.out.print("Width: " );
                Double width = sc.nextDouble();
                System.out.print("Height: " );
                Double height = sc.nextDouble();
                Shape retangle = new Retangle(Color.valueOf(color), width, height);
                list.add(retangle);
            }else{
                System.out.print("Radius: " );
                Double radius = sc.nextDouble();
                Shape circle = new Circle(Color.valueOf(color), radius);
                list.add(circle);
            }

        }
        System.out.println("SHAPE AREAS:");
        for(Shape s: list){
            System.out.println(String.format("%.2f",s.area()));
        }
    }
}

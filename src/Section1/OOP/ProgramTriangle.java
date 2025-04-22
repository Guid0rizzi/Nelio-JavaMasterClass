package Section1.OOP;

import Section1.OOP.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        Locale.setDefault(Locale.US);
        System.out.println("Enter with the measures of triangule x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter with the measures of triangule y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();
        if (areaX > areaY) {
            System.out.println("larger area: X " + areaX);
        } else {
            System.out.println("larger area Y " + areaY);
        }
        sc.close();
    }
}

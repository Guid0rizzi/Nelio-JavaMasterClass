package Introduction;

import java.util.Locale;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        Locale.setDefault(Locale.US);
        System.out.println("Enter with the measures of triangule x");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter with the measures of triangule y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        if (areaX > areaY) {
            System.out.println("larger area: X " + areaX);
        } else {
            System.out.println("larger area Y " + areaY);
        }
        sc.close();
    }
}

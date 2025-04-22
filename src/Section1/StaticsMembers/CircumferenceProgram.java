package Section1.StaticsMembers;

import Section1.StaticsMembers.util.Calculate;

import java.util.Locale;
import java.util.Scanner;

public class CircumferenceProgram {
    public static void main(String[] args) {

            System.out.println("Enter radius");
            Scanner sc = new Scanner(System.in);
            double radius = sc.nextDouble();
            double c = Calculate.Circumference(radius);
            double v = Calculate.Volume(radius);
            System.out.println("Circunference: "+ c +" "+ "Volume: "+ v+" "+ "PI value "+ Calculate.PI);
    }
}

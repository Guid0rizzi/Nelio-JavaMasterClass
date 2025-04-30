package Section1.StaticsMembers;

import Section1.StaticsMembers.util.CalculateCircumference;

import java.util.Scanner;

public class CircumferenceProgram {
    public static void main(String[] args) {

            System.out.println("Enter radius");
            Scanner sc = new Scanner(System.in);
            double radius = sc.nextDouble();
            double c = CalculateCircumference.Circumference(radius);
            double v = CalculateCircumference.Volume(radius);
            System.out.println("Circunference: "+ c +" "+ "Volume: "+ v+" "+ "PI value "+ CalculateCircumference.PI);
    }
}

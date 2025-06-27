package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class VectorEverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements will be in the vector?");
        int n = sc.nextInt();
        double [] numVector = new double[n];
        for (int i = 0 ; i < numVector.length; i++){
            System.out.println("type the number");
            double vectorElement = sc.nextDouble();
            numVector[i] = vectorElement;
        }
        double sum = 0.0;
        for (int i = 0 ; i < numVector.length; i++){
            sum += numVector[i];
        }
        double average = sum / numVector.length;
        System.out.println("Vecto's average: " + average);
        System.out.println("Elements under the everage");
        for (int i = 0 ; i < numVector.length; i++){
            if(numVector[i]< average){

                System.out.println(numVector[i]);
            }
        }

    }
}

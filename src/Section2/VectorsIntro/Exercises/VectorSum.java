package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers the vector will have?");
        int n = sc.nextInt();
        int [] vectorA = new int[n];
        int [] vectorB = new int[n];
        System.out.println("Type the A vector's values");
        for (int i = 0 ; i< vectorA.length; i++ ){
            int numbersA = sc.nextInt();
            vectorA[i] = numbersA;
        }
        System.out.println("Type the B vector's values");
        for (int i = 0 ; i< vectorB.length; i++ ){
            int numbersB = sc.nextInt();
            vectorB[i] = numbersB;
        }
        System.out.println("Vecto's result: ");
        int [] vectorResult = new int[n];

        for (int i = 0 ; i< vectorResult.length; i++ ){
            vectorResult [i] = vectorA[i] + vectorB[i];
        }
        for (int i = 0 ; i< vectorResult.length; i++ ){
            System.out.println(vectorResult[i]);
        }

    }
}

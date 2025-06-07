package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int num = sc.nextInt();
        double [] numbers = new double[num];
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Digite os numeros");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }
        System.out.println("Values");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("sum");
        System.out.println(sum);
        double avg = sum/numbers.length;
        System.out.println("evg");
        System.out.println(avg);
        sc.close();
    }
}

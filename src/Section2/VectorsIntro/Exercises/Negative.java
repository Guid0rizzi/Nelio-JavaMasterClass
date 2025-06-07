package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int number = sc.nextInt();
        int [] numbersArray = new int[number];

        for(int i =0; i<numbersArray.length; i++){
            sc.nextLine();
            System.out.println("Digite um numero");
            int numero = sc.nextInt();
            numbersArray[i] = numero;
        }
        System.out.println("numeros negativos");
        for(int i = 0; i<numbersArray.length; i++){
            if(numbersArray[i] < 0){
                System.out.println(numbersArray[i]);
            }
        }
        sc.close();
    }
}

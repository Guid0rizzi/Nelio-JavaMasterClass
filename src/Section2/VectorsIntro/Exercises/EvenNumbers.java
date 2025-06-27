package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many you will type");
        int n = sc.nextInt();
        int [] numberArray = new int[n];
        for(int i = 0 ; i< numberArray.length; i++ ){
            sc.nextLine();
            System.out.println("Type the number");
            int number = sc.nextInt();
            numberArray[i] = number; // adiciona o valor no array
        }
        System.out.println("Even numbers: ");
        for(int i = 0 ; i< numberArray.length; i++){
            if( (numberArray[i] % 2)  == 0){ // se o numero
                System.out.println(numberArray[i]); // sempre mostra o valor
            }
        }
        int evenNumbers = 0; // contador
        for (int i = 0 ; i< numberArray.length; i++){
            if((numberArray[i] % 2)  == 0){
                evenNumbers ++;
            }

        }
        System.out.println("Even numbers quantity: "+evenNumbers);

        sc.close();
    }
}

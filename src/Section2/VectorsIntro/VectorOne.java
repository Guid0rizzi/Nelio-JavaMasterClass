package Section2.VectorsIntro;

import java.util.Scanner;

public class VectorOne {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Integer n = sc.nextInt();
            double [] vect = new double[n];
            for(int i = 0; i < n ; i++){
                vect[i] = sc.nextDouble();
            }
            double sum = 0.0;

            for(int i = 0; i < vect.length ; i++){
                sum += vect[i];
            }
            double evarage = sum / n;
            System.out.println(evarage);
            sc.close();
        }

}

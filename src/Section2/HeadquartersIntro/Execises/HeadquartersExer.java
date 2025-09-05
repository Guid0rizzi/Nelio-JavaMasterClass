package Section2.HeadquartersIntro.Execises;

import java.util.Scanner;

public class HeadquartersExer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int headQuarter [] [] = new int[n][n]; // n n é a dimensão da matrix
        for (int i = 0 ; i< n; i++){
            for (int j = 0; j< n; j++){
                headQuarter[i][j] = sc.nextInt(); // pra cada posição da matriz adicione um valor
            }
        }
        System.out.println("Main diagonal");
        for (int i =0 ; i< n; i++){
            System.out.println(headQuarter[i][i]);// diagonal one ii, diagonal two jj
        }
        int negatives = 0;
        for (int i = 0; i< n; i++){
            for (int j = 0; j<n;j++){
                if (headQuarter[i][j] < 0){ // se na posição for menor do que zero
                    negatives++; // adicione um no contador negative
                }
            }
        }
        System.out.println("negative numbers quantity: "+negatives);
    }

}

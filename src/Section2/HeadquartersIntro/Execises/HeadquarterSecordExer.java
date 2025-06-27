package Section2.HeadquartersIntro.Execises;

import java.util.Scanner;

public class HeadquarterSecordExer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // SE COLOCAR SOUT ATRAPALHA
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [][] headQuarters = new int[n1][n2];
        for(int i = 0; i< headQuarters.length; i++){
            for (int j = 0; j< headQuarters[i].length; j++){
               headQuarters [i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i = 0; i< headQuarters.length; i++){
            for (int j = 0; j< headQuarters[i].length; j++){
                if (headQuarters[i][j] == x){
                    System.out.println("Position "+i +","+ j); // i e j é onde o numero se localiza
                    if(j > 0){
                        System.out.println("left " +  headQuarters[i][j-1]);
                    }
                    if(j > headQuarters[i].length){
                        System.out.println("right " +  headQuarters[i][j+1]);
                    }

                    if(j < headQuarters[i].length -1){
                        System.out.println("Up "+ headQuarters[i-1][j]);
                    }
                    if(i < headQuarters.length-1) {
                        System.out.println("Down " + headQuarters[i + 1][j]);
                    }
                }

            }
        }

    }
}

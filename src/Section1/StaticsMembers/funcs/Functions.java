package Section1.StaticsMembers.funcs;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        int numeroTres = sc.nextInt();


        int numeroMaximo = max(numeroUm, numeroDois, numeroTres);
        mostrar(numeroMaximo);

    }
    public static int max (int x, int y, int z){ //-- "static" tornam as funções independentes das classes
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z && y > x) {
            aux = y;
        }else{
            aux = z;
        }

        return aux;
    }
    public static void mostrar (int aux){
        System.out.println("o numero maximo é "+ aux);
    }
}

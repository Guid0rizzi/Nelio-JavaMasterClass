package Section6.TryCatch;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String [] vect = sc.nextLine().split(" ");
            Integer position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nem te isso tudo de elemento mano HAHAHHA");

        }catch (InputMismatchException e ){
            System.out.println("Cara, vc coloca uns negocio meio nada a ver???");
        }

        sc.close();
    }
}

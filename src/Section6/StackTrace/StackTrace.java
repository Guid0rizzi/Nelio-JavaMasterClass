package Section6.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {

        method1();
        System.out.println("End of program");
    }
    public static void method1 (){
        System.out.println("----Method1 start----");
        method2();
        System.out.println("----Method1 end----");
    }

    public static void method2(){
        System.out.println("----Method2 start----");
        Scanner sc = new Scanner(System.in);
        try{
            String [] vect = sc.nextLine().split(" ");
            Integer position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nem te isso tudo de elemento mano HAHAHHA");
            e.printStackTrace();
            sc.next();

        }catch (InputMismatchException e ){
            System.out.println("Cara, vc coloca uns negocio meio nada a ver???");
        }
        System.out.println("----Method2 end----");
        sc.close();
    }
}

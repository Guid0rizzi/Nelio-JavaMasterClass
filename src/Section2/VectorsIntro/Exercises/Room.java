package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


        Rent [] vect = new Rent[10];
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            sc.nextLine();
            System.out.println("Rent #"+(i+1)+":");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int  roomNumber = sc.nextInt();
            vect[roomNumber] = new Rent(name, email);
        }
        System.out.println("------------------------------------------");
        System.out.println("busy rooms:");
        for(int i = 0; i< vect.length; i++){
            if (vect[i]!= null){ // se o quarto for diferente de null ele esta ocupado
                System.out.println(i +": "+ vect[i]); //quartos que estão ocupados
            }
        }

    }
}
class Rent {
    String name;
    String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name" + name +
                " email" + email;
    }
}

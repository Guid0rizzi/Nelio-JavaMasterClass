package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas");
        int num = sc.nextInt();
        PersonHeight [] persons = new PersonHeight[num];
        for(int i = 0; i < persons.length; i++ ){
        sc.nextLine();
            System.out.println("Dados da pessoa "+(i+1));
            System.out.println("Nome");
            String name = sc.nextLine();
            System.out.println("Idade");
            int age = sc.nextInt();
            System.out.println("Altura");
            double height = sc.nextDouble();
            persons[i] = new PersonHeight(name, age, height); //aqui ele recebe as pessoas criadas
        }
        double sum = 0.0;
        for (int i = 0; i < persons.length; i++){
            sum += persons[i].height;
        }
        System.out.println("Altura media");
        System.out.println(sum/ persons.length);
        System.out.println("Pessoas com menos de 16 anos");
        int minorsCount = 0;
        for (int i =0; i< persons.length; i++){
            if (persons[i].getAge() < 16){
                minorsCount ++; //pra cada person com menos de 16 ele vai adicionar 1
            }
        }
        double minorsPercent = ((double)minorsCount/ persons.length)*100;
        System.out.println(minorsPercent);
        for (int i =0; i< persons.length; i++){
            if (persons[i].getAge() < 16){
                System.out.println(persons[i].getName());
            }
        }

    }
}








class PersonHeight{
    String name;
    int age;
    double height;

    public PersonHeight(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

package Section2.VectorsIntro.Exercises;

import java.util.Scanner;

public class PeopleData {
    public static void main(String[] args) {
        System.out.println("How many people you will type?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person [] personArray = new Person[n];
        for(int i = 0 ; i< personArray.length; i++){
            sc.nextLine();
            System.out.println("Person data "+(i+1));
            System.out.println("Add the height");
            double height = sc.nextDouble();
            System.out.println("Add the sex");
            sc.nextLine();
            String sex = sc.nextLine();

            personArray[i] = new Person(height, sex);
        }
        double shortest = personArray[0].getHeight(); // estou pegando um valor dentro do array e esse valor vai ser um double
        double tallest = personArray[0].getHeight();
        for (int i = 0 ; i< personArray.length; i++){
            double height = personArray[i].getHeight();
            if(height < shortest){ // height = 150 < shortest = 150
                shortest = height; // shortest = 150

            }
            if(height > tallest){ // height = 180 > tallest = 150
                tallest = height;

            }
        }
        int womenQuantity =0;
        int menQuantity = 0;
        double womenHeightSum = 0.0;
        System.out.println("the shortest one "+ shortest);
        System.out.println("the tallest one "+ tallest);
        for(int i = 0 ; i < personArray.length ; i++){
            if("F".equals(personArray[i].getSex())){
                womenQuantity ++;
                womenHeightSum += personArray[i].getHeight();
            }
            if("M".equals(personArray[i].getSex())){
                menQuantity++;
            }
        }

        double evarage = womenHeightSum / womenQuantity;
        System.out.println("Women height evarage "+ evarage);
        System.out.println("Women quantity "+ womenQuantity);
        System.out.println("Men quantity "+ menQuantity );
    }

//        System.out.println("How many people you will type");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Person[] personArray = new Person[n];
//        for (int i = 0; i < personArray.length; i++) {
//            System.out.println("Person " + (i + 1) + " data");
//            System.out.println("Height");
//            double height = sc.nextDouble();
//            sc.nextLine();
//            System.out.println("Sex");
//            String sex = sc.nextLine();
//            personArray[i] = new Person(height, sex);
//            sc.nextLine();
//
//
//        }
//
//        double tallestHeight = personArray[0].getHeight(); //indice zero
//        double shortestHeight = personArray[0].getHeight();
//        for (int i = 0; i < personArray.length; i++) {
//            double height = personArray[i].getHeight();
//            if (height < shortestHeight){ // aqui comparamos se o valor atual da altura é menor do que a altura no indice zero
//                shortestHeight = height; // se for ele, o menor vai receber o valor da altura atual
//            }
//
//            if (height > tallestHeight){
//
//                tallestHeight = height;
//            }
//        }
////        System.out.println("tallest one "+ tallestHeight);
//        System.out.println("shortest one "+ shortestHeight);
//
//
//        int womenNumber = 0;
//        double womenHeightSum = 0.0;
//        for (int i = 0; i < personArray.length; i++) {
//            if ("F".equals(personArray[i].getSex())) {
//                womenNumber++;
//                womenHeightSum += personArray[i].getHeight();
//            }
//        }
//        double average = womenHeightSum /womenNumber;
//
//        System.out.println("Women height average: " + average);
//
//        int menNumber = 0;
//        for (int i = 0; i < personArray.length; i++) {
//            if ("M".equals(personArray[i].getSex())) {
//                menNumber++;
//            }
//        }
//        System.out.println("Men quantity: " + menNumber);
//
//
//        sc.close();
//    }
}

class Person {
    double height;
    String sex;

    public Person(double height, String sex) {
        this.height = height;
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
package Section2.VectorsIntro;

import java.util.Scanner;

public class VectorTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        VectorProduct[] vect = new VectorProduct[num];
        for(int i = 0; i<num; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] =  new VectorProduct(price, name);
        }
        double sum = 0.0;
        for (int i = 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }
        Double avg = sum/num;
        System.out.println(avg);

    }


}


class VectorProduct{
 double price;
 String name;

    public VectorProduct(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

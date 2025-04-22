package Section1.OOP;

import Section1.OOP.entities.Product;

import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        Double productPrice = sc.nextDouble();
        Integer productQuantity = sc.nextInt();
        Product p = new Product(productName, productPrice, productQuantity);
        p.toString();
        System.out.println(p);//-- tornando o obj em uma string (mas preciso colocar a função toString na classe)

        System.out.println("Product data:"+ p.getName()+ " $"+p.getPrice()+", "+ p.getQuantity()+"units, Total: $"+p.TotalValueStock());
        int addingProduct = sc.nextInt();
        p.AddProduct(addingProduct);
        System.out.println("Product data:"+ p.getName()+ " $"+p.getPrice()+", "+ p.getQuantity()+"units, Total: $"+p.TotalValueStock());
        int removingProduct = sc.nextInt();
        p.removeProduct(removingProduct);
        System.out.println("Product data:"+ p.getName()+ " $"+p.getPrice()+", "+ p.getQuantity()+"units, Total: $"+p.TotalValueStock());
        sc.close();


    }
}

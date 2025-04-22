package Section1.OOP.entities;

public class Product {
    String name;
    Double price;
    Integer quantity;

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public double TotalValueStock(){
        return price * quantity;
    }
    public void AddProduct (int quantity){//--- não retorna nada (void) pq ele esta simplesmente alterando a quantidade do produto
        this.quantity += quantity;
    }
    public void removeProduct (int quantity){//--- não retorna nada (void) pq ele esta simplesmente alterando a quantidade do produto
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

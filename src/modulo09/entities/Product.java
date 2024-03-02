package modulo09.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }    

    public String toString() {
        return "\n" + 
            "Produto: " + name + "\n" +
            "Preço: " + String.format("%.2f", price) + "\n" +
            "Quantidade: " + quantity + "\n";


    }
}

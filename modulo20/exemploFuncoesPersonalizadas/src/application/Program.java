package application;

import model.entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",5000.0));
        list.add(new Product("PS5",3000.0));
        list.add(new Product("Home Theater",1000.0));
        list.add(new Product("Table",1000.0));

        Double sum = ProductService.filteredSum(list, p -> p.getName().charAt(0) == 'P');

        System.out.println("Soma: " + String.format("%.2f", sum));

    }
}

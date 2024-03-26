package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",5000.0));
        list.add(new Product("PS5",3000.0));
        list.add(new Product("Home Theater",1000.0));

        //Exemplo classe apartada
        //list.sort(new myComparator());

        //Exemplo classe anonima
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
//        list.sort(comp);

        //Exemplo com lambda
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list) {
            System.out.println(p);
        }
    }
}

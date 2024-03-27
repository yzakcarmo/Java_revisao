package model.services;

import model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public static double filteredSum(List<Product> list, Predicate<Product> pred) {
        double sum = 0.0;
        for(Product p : list) {
            if(pred.test(p)) sum+= p.getPrice();
        }
        return sum;
    }
}

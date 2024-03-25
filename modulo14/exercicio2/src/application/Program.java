package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.UsedProduct;
import entities.ImportedProduct;
import entities.Product;

public class Program {
    public static void main(String[] args) {        

        //Dados Teste
        /*List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 500.0));
        products.add(new ImportedProduct("PS5", 3000.0, 500.0));
        products.add(new UsedProduct("Home Theater", 100.0, LocalDate.parse("2023-08-20")));*/
        
        Scanner scan = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        String name;
        Double price;
        int n;

        System.out.print("Quantidade de produtos: ");
        n = scan.nextInt();

        for (int i = 1; i <=n; i++) {
            char tipo;
            System.out.println("Dados Produto #" + i + ":");
            System.out.print("Produto é normal, usado ou importado (n/u/i)? ");
            tipo = scan.next().charAt(0);
            System.out.print("Nome: ");
            name = scan.next();
            System.out.print("Preço: ");
            price = scan.nextDouble();
            switch (tipo) {
                case 'u':
                    System.out.print("Data fabricação(DD/MM/AAAA): ");
                    products.add(new UsedProduct(name, price, LocalDate.parse(scan.next(), UsedProduct.fmt)));
                break;

                case 'i':
                    System.out.print("Taxa Importação: ");
                    products.add(new ImportedProduct(name, price, scan.nextDouble()));
                break;

                default:
                    products.add(new Product(name, price));
                break;
            }            
        }
        scan.close();

        System.out.println("Etiquetas:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }     
}

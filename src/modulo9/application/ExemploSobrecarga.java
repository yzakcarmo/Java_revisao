package modulo9.application;

import java.util.Scanner;

import modulo9.entities.Product;

public class ExemploSobrecarga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Nome: ");
        String name = scan.nextLine();
        System.out.print("Preço: ");
        double price = scan.nextDouble();        
        Product produtoSimples = new Product(name, price);
        System.out.println("Simples:");
        System.out.print(produtoSimples);*/

        System.out.print("Nome: ");
        String name = scan.nextLine();
        System.out.print("Preço: ");
        double price = scan.nextDouble();
        int quantity = scan.nextInt();
        scan.close();
        Product produtoCompleto = new Product(name, price, quantity);
        System.out.println("Completo(Sobrecarga Construtor):");
        System.out.println(produtoCompleto);
    }
}

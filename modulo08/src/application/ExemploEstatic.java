package application;

import entities.Calculator;

import java.util.Scanner;

public class ExemploEstatic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        double amount = scan.nextDouble();
        scan.close();

        Calculator.convert(price, amount);
    }
}

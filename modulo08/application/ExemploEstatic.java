package modulo08.application;

import java.util.Scanner;

import modulo08.entities.Calculator;

public class ExemploEstatic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        double amount = scan.nextDouble();
        scan.close();

        Calculator.convert(price, amount);
    }
}

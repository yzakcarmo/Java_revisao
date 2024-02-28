package modulo8.entities;

public class Calculator {
    public static final double IOF = 0.06;
    
    public static void convert (double price, double amount) {
        System.out.printf("Valor a pagar em reais = %.2f", (price * amount) * (1 + IOF));
    }

}

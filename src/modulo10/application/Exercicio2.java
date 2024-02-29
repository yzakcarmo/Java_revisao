package modulo10.application;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade: ");
        double total = 0;
        int quant = scan.nextInt();        
        double[] num = new double[quant];

        for(int i = 0; i < num.length; i++) {
            System.out.print("Numero: ");
            num[i] = scan.nextDouble();
        }
        scan.close();

        System.out.print("Valores: ");
        for(double obj : num) {
            System.out.printf("%.1f" + " ", obj);
            total+= obj;
        }

        System.out.printf("\n" + "SOMA: %.1f", total);
        System.out.printf("\n" + "MEDIA: %.1f", total/num.length);
    }
}

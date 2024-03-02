package modulo05;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cod = scan.nextInt();
        int quant = scan.nextInt();
        double total = 0;

        scan.close();
        switch (cod) {
            case 1:
                total = 4*quant;
                break;
            case 2:
                total = 4.5*quant;
                break;
            case 3:
                total = 5*quant;
                break;
            case 4:
                total = 2*quant;  
                break;          
            default:
                total = 1.5*quant;
                break;
        }
        System.out.printf("Total: R$ %.2f", total);
    }
}

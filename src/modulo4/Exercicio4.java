package modulo4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numFunc = scan.nextInt();
        int quantHoras = scan.nextInt();
        float valorHora = scan.nextFloat();
        scan.close();

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f", valorHora*quantHoras);
                
    }
}

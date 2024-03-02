package modulo06;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fim = scan.nextInt();
        int par = 0;
        scan.close();

        for(int i = 1; i <= fim; i++) {
            if(i%2 == 0) par++;
        }
        System.out.printf("Tiveram %d numero pares", par);
    }
}

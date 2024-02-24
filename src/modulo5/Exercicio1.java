package modulo5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        scan.close();
        if(i<0) System.out.println("NEGATIVO");
        else System.out.println("NÃO NEGATIVO");
    }

}

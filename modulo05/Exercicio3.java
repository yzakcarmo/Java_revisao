package modulo05;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        scan.close();
        if(a%b == 0 || b%a == 0) System.out.println("MULTIPLOS");
        else System.out.println("NÃO MULTIPLOS");       
    }
}

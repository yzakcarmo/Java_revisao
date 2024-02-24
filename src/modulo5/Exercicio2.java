package modulo5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        scan.close();
        if(i%2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");        
    }
    
}

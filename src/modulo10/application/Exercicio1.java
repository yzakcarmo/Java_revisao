package modulo10.application;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade: ");
        int quant = scan.nextInt();
        boolean negativo = false;
        int[] num = new int[quant];      
        
        for(int i = 0; i< num.length; i++) {
            System.out.print("Numero: ");    
            num[i] = scan.nextInt();
            if( num[i] < 0 ) negativo = true;
        }        
        scan.close();

        if(negativo) {
            System.out.println("\n" + "Números Negativos:");
            for(int obj : num) {
                if(obj < 0) System.out.println(obj);
            }
        } else System.out.println("\n" + "SEM NEGATIVOS");

        
    }
}

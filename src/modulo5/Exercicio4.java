package modulo5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int comeco = scan.nextInt();
        int fim = scan.nextInt();

        scan.close();
        int tempo = fim - comeco;
        
        if(tempo <= 0) tempo+= 24;

        System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
    }
}

package application;

import entities.Retangulo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a Altura:");
        double height = scan.nextDouble();
        System.out.println("Insira a Largura:");
        double width = scan.nextDouble();
        scan.close();

        Retangulo retangulo = new Retangulo(width, height);

        System.out.printf("AREA: %.2f \n", retangulo.area());
        System.out.printf("PERIMETRO: %.2f \n", retangulo.perimeter());
        System.out.printf("DIAGONAL: %.2f \n", retangulo.diagonal());
    }
}

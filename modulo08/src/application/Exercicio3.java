package application;

import entities.Student;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        scan.close();
        
        Student aluno = new Student(nome, n1, n2, n3);
        aluno.avalia();
    }
}

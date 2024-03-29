package application;

import entities.Employee;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        double salary = scan.nextDouble();
        double tax = scan.nextDouble();        

        Employee empregado = new Employee(nome, salary, tax);

        System.out.printf("Empregado: %s, $ %.2f \n",empregado.getName(), empregado.netSalary());

        System.out.print("\nQual % de aumento: ");
        empregado.increaseSalary(scan.nextDouble());
        scan.close();

        System.out.printf("\nAtualizado: %s, $ %.2f",empregado.getName(), empregado.netSalary());
    }
}

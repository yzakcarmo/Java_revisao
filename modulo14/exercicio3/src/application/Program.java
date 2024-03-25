package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cnpj;
import entities.Contribuinte;
import entities.Cpf;

public class Program {
    public static void main(String[] args) {
        //Dados teste
        /*List<Contribuinte> list = new ArrayList<>();
        list.add(new Cpf("cpf1", 1000.0, 50.0));
        list.add(new Cpf("cpf2", 2000.0, 50.0));
        list.add(new Cnpj("cnpj1", 1000.0, 10));
        list.add(new Cnpj("cnpj2", 1000.0, 20));*/

        List<Contribuinte> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String name;
        Double income;
        Double taxes = 0.0;
        int n;

        System.out.print("Quantidade de Contribuintes: ");
        n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            char tipo;
            System.out.println();
            System.out.println("Contribuinte #" + i + ":");
            System.out.print("Pessoa ou Empresa(p/e)? ");
            tipo = scan.next().charAt(0);
            System.out.print("Nome: ");
            name = scan.next();
            System.out.print("Renda: ");
            income = scan.nextDouble();
            if(tipo == 'p') {
                System.out.print("Gastos com saude: ");
                list.add(new Cpf(name, income, scan.nextDouble()));
            }
            else {
                System.out.print("Quantidade de funcionarios: ");
                list.add(new Cnpj(name, income, scan.nextInt()));
            }
        }

        scan.close();
        System.out.println("Impostos Pagos:");
        for (Contribuinte contribuinte : list) {
            System.out.println(contribuinte);
            taxes+=contribuinte.tax();
        }
        System.out.printf("Total de Impostos: %.2f", taxes);
    }
}

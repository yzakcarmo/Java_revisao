package modulo14.exercicio1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo14.exercicio1.entities.Employee;
import modulo14.exercicio1.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {        

        //Dados Teste
        /*List<Employee> employees = new ArrayList<>();
        Employee employee = new OutsourcedEmployee("T1", 2, 50.0, 200.0);
        employees.add(employee);
        employees.add(new Employee("T2", 3, 40.0));*/
        
        Scanner scan = new Scanner(System.in);
        String name;
        Integer hours;
        int n;
        
        Double price;
        Double value;
        List<Employee> employees = new ArrayList<>();

        System.out.print("Quantidade de Funcionarios: ");
        n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("\n" + "Dados funcionario #" + i + ":");
            System.out.print("Terceirizado (y/n)? ");
            char out = scan.next().charAt(0);

            System.out.print("Insira o nome: ");
            name = scan.next();
            System.out.print("Quantidade horas: ");
            hours = scan.nextInt();
            System.out.print("Insira o preço por hora: ");
            price = scan.nextDouble();
            if(out == 'y') {                
                System.out.print("Insira o Valor adicional: ");
                value = scan.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, price, value));
            }
            else {
                employees.add(new Employee(name, hours,price));
            }                                   
        }
        scan.close();

        System.out.println();
        System.out.println("Pagamentos:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }     
}

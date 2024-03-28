package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String path = "modulo20/exercicio/file/in.csv";
        List<Employee> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null) {
                String[] fields =  line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            for (String e : emails){
                System.out.println(e);
            }
            System.out.println();

            double sum = list.stream()
                    .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Soma dos salarios dos funcionarios que começam com M é " + sum);
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

package modulo13.exercicio1.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modulo13.exercicio1.entities.Departament;
import modulo13.exercicio1.entities.HourContract;
import modulo13.exercicio1.entities.Worker;
import modulo13.exercicio1.entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {

        //Dados Mockados
        Worker func = new Worker("Teste", WorkerLevel.valueOf("Junior"), 1200.0, new Departament("Design"));
        String base = "08/2020";
        

        /*Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //Criando funcionario
        System.out.print("Departamento: ");
        String departament = scan.nextLine();
        System.out.println("\n"+"Dados Funcionario:");
        System.out.print("Nome: ");
        String name = scan.nextLine();
        System.out.print("Nivel: ");
        String level = scan.nextLine();
        System.out.print("Salario: ");
        Double salary = scan.nextDouble();
        Worker func = new Worker(name, WorkerLevel.valueOf(level), salary, new Departament(departament));

        //Adicionando os contratos
        System.out.print("Quant. Contratos: ");
        Integer n = scan.nextInt();

        for(int i = 1; i <= n; i++) {            
            System.out.println("Dados contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate data = LocalDate.parse(scan.nextLine(), fmt);
            System.out.print("\n" + "Preço da Hora: ");
            Double price = scan.nextDouble();
            System.out.print("\n" + "Duração (horas): ");
            Integer hours = scan.nextInt();

            HourContract contrato = new HourContract(data, price, hours);

            func.addContract(contrato);
        }
        
        //Gerando o calculo
        System.out.print("\n" + "Mês e Ano para calculo (MM/YYYY): ");
        String base = scan.nextLine();
        scan.close();
        */

       Integer ano = Integer.parseInt(base.substring(0,1));
        Integer mes = Integer.parseInt(base.substring(3,6));
        Double total = func.income(ano,mes);

        System.out.println("Nome: " + func.getName());
        System.out.println("Departamento: " + func.getDepartament());
        System.out.println("Total por " + base + ": " + total);
        
    }
}

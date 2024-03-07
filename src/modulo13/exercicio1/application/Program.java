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
        
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        /*//Dados Mockados
        Worker func = new Worker("Teste", WorkerLevel.valueOf("JUNIOR"), 1200.0, new Departament("Design"));
        HourContract contrato1 = new HourContract(LocalDate.parse("20/08/2020", fmt1), 5.0, 2);
        HourContract contrato2 = new HourContract(LocalDate.parse("20/08/2021", fmt1), 5.0, 2);
        func.addContract(contrato1);
        func.addContract(contrato2);
        String search = "08/2020";*/
        
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
            System.out.println("\n" + "Dados contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate data = LocalDate.parse(scan.next(), fmt1);
            System.out.print("Preço da Hora: ");
            Double price = scan.nextDouble();
            System.out.print("Duração (horas): ");
            Integer hours = scan.nextInt();

            HourContract contrato = new HourContract(data, price, hours);

            func.addContract(contrato);
        }
        
        //Gerando o calculo
        System.out.print("\n" + "Mês e Ano para calculo (MM/YYYY): ");
        String search = scan.next();
        scan.close();

        Integer mes = Integer.parseInt(search.substring(0, 2));
        Integer ano = Integer.parseInt(search.substring(3));        

        System.out.println("Nome: " + func.getName());
        System.out.println("Departamento: " + func.getDepartament().getName());
        System.out.println("Total por " + search + ": " + String.format("%.2f", func.income(mes,ano)));
        
    }
}

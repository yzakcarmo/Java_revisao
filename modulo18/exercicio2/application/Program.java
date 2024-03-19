package modulo18.exercicio2.application;

import java.time.LocalDate;
import java.util.Scanner;

import modulo18.exercicio2.model.entities.Contract;
import modulo18.exercicio2.model.services.ContractService;
import modulo18.exercicio2.model.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        
        /* Contract contract = new Contract(1, LocalDate.parse("25/06/2018", Contract.fmt), 600.0);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, 3);
        System.out.println(contract); */

        Scanner sc = new Scanner(System.in);
        Integer number;
        LocalDate date;
        Double value;        

        System.out.print("Insira o numero do contrato: ");
        number = sc.nextInt();
        System.out.print("Insira o inicio do contrato(DD/MM/AAAA): ");
        date = LocalDate.parse(sc.next(),Contract.fmt);
        System.out.print("Insira o valor do contrato: ");
        value = sc.nextDouble();
        Contract contract = new Contract(number, date, value);

        ContractService contractService = new ContractService(new PaypalService());
        System.out.print("Insira o numero de parcelas: ");
        contractService.processContract(contract, sc.nextInt());
        sc.close();

        System.out.println(contract);
    }
}

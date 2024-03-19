package modulo18.exercicio1.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modulo18.exercicio1.model.entities.CarRental;
import modulo18.exercicio1.model.entities.Vehicle;
import modulo18.exercicio1.model.services.BrazilTaxService;
import modulo18.exercicio1.model.services.RentalService;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //Dados teste
        /* CarRental rental = new CarRental(new Vehicle("Corolla"), LocalDateTime.parse("20/08/1998 12:00", fmt), LocalDateTime.parse("21/08/1998 00:00", fmt));
        RentalService rentalService = new RentalService(10.0, 200.0, new BrazilTaxService());
        rentalService.processInvoice(rental);
        System.out.println("Aluguel Hora: ");
        System.out.println(rental.getInvoice() + "\n");

        CarRental rental2 = new CarRental(new Vehicle("208"), LocalDateTime.parse("20/08/1998 12:00", fmt), LocalDateTime.parse("21/08/1998 12:00", fmt));
        RentalService rentalService2 = new RentalService(10.0, 200.0, new BrazilTaxService());
        rentalService2.processInvoice(rental2);
        System.out.println("Aluguel Dia: ");
        System.out.println(rental2.getInvoice()); */
         
        
        Scanner sc = new Scanner(System.in);
        String model;
        LocalDateTime start;
        LocalDateTime finish;
        Double priceHour;
        Double priceDay;

        System.out.print("Insira o modelo: ");
        model = sc.nextLine();
        System.out.print("Retirada (DD/MM/AAAA HH:MM): ");
        start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (DD/MM/AAAA HH:MM): ");
        finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental rental = new CarRental(new Vehicle(model), start, finish);

        System.out.print("Preço por hora: ");
        priceHour = sc.nextDouble();
        System.out.print("Preço por dia: ");
        priceDay = sc.nextDouble();
        sc.close();

        RentalService rentalService = new RentalService(priceHour, priceDay, new BrazilTaxService());
        rentalService.processInvoice(rental);

        System.out.println(rental.getInvoice());       
    }
}

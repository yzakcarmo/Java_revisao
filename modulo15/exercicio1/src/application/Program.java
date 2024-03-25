package application;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.exceptions.DomainException;
import model.entities.Reservation;

public class Program {
    public static void main(String[] args) {       
        try {
            Scanner sc = new Scanner(System.in);
            LocalDate checkIn;
            LocalDate checkOut;

            //Dados teste
            /*Reservation reserva = new Reservation(1001, LocalDate.parse("2024-06-12"), LocalDate.parse("2024-06-19"));*/
            
            Integer roomNumber;            

            System.out.print("Número do quarto: ");
            roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(),Reservation.fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(),Reservation.fmt);
            Reservation reserva = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println();
            System.out.println(reserva);
            
            System.out.println();
            System.out.println("Dados para ajuste da reserva:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(),Reservation.fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(),Reservation.fmt);
            sc.close();
            System.out.println();
            reserva.updateDates(checkIn, checkOut);
            
            System.out.println(reserva);
            System.out.println();
        }
        catch(DateTimeParseException e) {
            System.out.println("Erro na reserva: Data incorreta");
        }
        catch(DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Erro inesperado");
        }      
    }
}

package modulo15.exercicio1.application;

import java.time.LocalDate;
import java.util.Scanner;

import modulo15.exercicio1.model.entities.Reservation;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer roomNumber;
        LocalDate checkIn;
        LocalDate checkOut;

        checkIn = LocalDate.parse(sc.next(),Reservation.fmt);
    }
}

package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {
    public static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation() {}

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if(checkOut.isBefore(LocalDate.now()) || checkIn.isBefore(LocalDate.now()))
        throw new DomainException("As datas de reserva devem ser futuras");
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
    
    public int duration() {
        Duration duration = Duration.between(checkIn.atStartOfDay(),checkOut.atStartOfDay());
        return (int)duration.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut){
        if(checkOut.isBefore(LocalDate.now()) || checkIn.isBefore(LocalDate.now()))
        throw new DomainException("As datas de atualização da reserva devem ser futuras");

        if(checkOut.isBefore(checkIn))
        throw new DomainException("A data de check-out deve ser depois do check-in");        

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString () {
        StringBuilder out = new StringBuilder();
        out.append("Reservation: Room ");
        out.append(roomNumber);
        out.append(", check-in: ");
        out.append(fmt.format(checkIn));
        out.append(", check-out: ");
        out.append(fmt.format(checkOut));
        out.append(", " + duration() + " nights");
        return out.toString();
    }
}

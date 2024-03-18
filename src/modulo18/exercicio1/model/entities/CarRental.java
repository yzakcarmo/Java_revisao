package modulo18.exercicio1.model.entities;

import java.time.LocalDateTime;

public class CarRental {    
    private Vehicle vehicle;
    private LocalDateTime start;
    private LocalDateTime finish;
    private Invoice invoice;

    public CarRental(Vehicle vehicle, LocalDateTime start, LocalDateTime finish, Invoice invoice) {
        this.vehicle = vehicle;
        this.start = start;
        this.finish = finish;
        this.invoice = invoice;
    }

    public CarRental() {}    

    public LocalDateTime getstart() {
        return start;
    }

    public void setstart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getfinish() {
        return finish;
    }

    public void setfinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }  
}

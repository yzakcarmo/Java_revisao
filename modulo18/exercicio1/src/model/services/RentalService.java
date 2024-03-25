package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double priceHour;
    private Double priceDay;

    private TaxService taxService;

    public RentalService(Double priceHour, Double priceDay, TaxService taxService) {
        this.priceHour = priceHour;
        this.priceDay = priceDay;
        this.taxService = taxService;
    }

    public Double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(Double priceHour) {
        this.priceHour = priceHour;
    }

    public Double getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(Double priceDay) {
        this.priceDay = priceDay;
    }

    public void processInvoice(CarRental rental) {
        Double minutes  = (double) Duration.between(rental.getStart(), rental.getFinish()).toMinutes();
        Double hours = minutes / 60.0;
        Double basicPayment;
        
        if(hours > 12) {
            basicPayment = priceDay * Math.ceil(hours / 24);
        }
        else basicPayment = priceHour * Math.ceil(hours);

        rental.setInvoice(new Invoice(taxService.tax(basicPayment), basicPayment));
    }
}

package modulo18.exercicio1.model.services;

public class RentalService {
    private Double priceHour;
    private Double priceDay;
    //private BrazilTaxService tax;

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

    /*public void processInvoice(CarRental rental) {

    }

    public double total() {
        Duration duration = Duration.between(start, finish);
        Double subtotal;
        
        if(duration.toHours() > 12) {
            subtotal = (duration.toHours() % 24 == 0) ? duration.toDays() * priceDay : (duration.toDays() + 1) * priceDay;
        }
        else subtotal = (duration.toMinutes() % 60 == 0) ? duration.toHours() * priceHour : (duration.toHours() + 1) * priceHour;               
    }*/
}

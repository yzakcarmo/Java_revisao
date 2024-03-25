package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;    

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public HourContract() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return hours*valuePerHour;
    }
}

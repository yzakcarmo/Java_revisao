package entities;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double price;

    public Employee(String name, Integer hours, Double price) {
        this.name = name;
        this.hours = hours;
        this.price = price;
    }
    
    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double payment() {
        return price * hours;
    }

    public String toString() {
        return name + " - $ " + String.format("%.2f",payment());
    }
}

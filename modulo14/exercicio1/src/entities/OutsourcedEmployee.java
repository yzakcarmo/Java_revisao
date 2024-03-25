package entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;
    public OutsourcedEmployee() {}
    public OutsourcedEmployee(String name, Integer hours, Double price, Double additionalCharge) {
        super(name, hours, price);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, Integer hours, Double price) {
        super(name, hours, price);
        additionalCharge = 0.0;
    }
    @Override
    public Double payment() {
        return super.payment() + (additionalCharge * 1.1);
    }       
}

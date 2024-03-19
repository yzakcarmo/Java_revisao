package modulo08.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double salary, double tax) {
        this.name = name;
        grossSalary = salary;
        this.tax = tax;
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary+= (grossSalary/100)*percentage;     
    }

    public String getName() { return name; }
}

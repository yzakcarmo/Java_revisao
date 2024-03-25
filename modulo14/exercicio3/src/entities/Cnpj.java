package entities;

public class Cnpj extends Contribuinte {
    private Integer employees;

    public Cnpj() {}

    public Cnpj(String name, Double income, Integer employees) {
        super(name, income);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public Double tax() {
        Double tax = income;
        if(employees > 10) {
            return tax *= 0.14;
        }
        else {
            return tax *= 0.16;
        }
    }
}

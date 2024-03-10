package modulo14.exercicio3.entities;

public abstract class Contribuinte {
    protected String name;
    protected Double income;    

    protected Contribuinte(){}

    protected Contribuinte(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public abstract Double tax();

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Double getincome() {
        return income;
    }

    public void setincome(Double income) {
        this.income = income;
    }

    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }
}

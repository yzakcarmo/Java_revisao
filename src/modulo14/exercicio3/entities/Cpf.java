package modulo14.exercicio3.entities;

public class Cpf extends Contribuinte {
    private Double heathInsurance;

    public Cpf(){}

    public Cpf(String name, Double income, Double heathInsurance) {
        super(name, income);
        this.heathInsurance = heathInsurance;
    }

    public Double getHeathInsurance() {
        return heathInsurance;
    }

    public void setHeathInsurance(Double heathInsurance) {
        this.heathInsurance = heathInsurance;
    }
    
    public Double tax() {
        Double tax = income;
        if(income < 2000) {
            tax *= 0.15;
        }
        else {
            tax *= 0.25;
        }
        return tax - (heathInsurance * 0.5);
    }
}

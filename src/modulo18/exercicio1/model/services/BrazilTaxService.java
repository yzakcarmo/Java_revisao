package modulo18.exercicio1.model.services;

public class BrazilTaxService implements TaxService {
    public Double tax (Double amount) {
        if(amount > 100.0) {
            return amount * 0.15;
        }
        else {
            return amount * 0.2;
        } 
    }
}

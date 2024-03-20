package modulo18.exemploDefaultMethods.model.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1)
            throw new InvalidParameterException("Mês tem que ser maior que zero");

        return amount * Math.pow(1.0 + getInterestRate() / 100.00, months);
    }
}

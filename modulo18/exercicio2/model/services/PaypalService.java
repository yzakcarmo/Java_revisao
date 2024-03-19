package modulo18.exercicio2.model.services;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * months * 0.01;
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }      
}

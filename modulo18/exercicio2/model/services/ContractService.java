package modulo18.exercicio2.model.services;

import modulo18.exercicio2.model.entities.Contract;
import modulo18.exercicio2.model.entities.Installment;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double baseValue = contract.getTotalValue() / months;      
        
        for(int i = 1; i <= months; i ++) {
            Double interest = paymentService.interest(baseValue, i);
            Double fee = paymentService.paymentFee(baseValue + interest);
            Double total = baseValue + interest + fee;
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), total));
        }        
    }
}

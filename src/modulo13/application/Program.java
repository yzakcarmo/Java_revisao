package modulo13.application;

import java.time.LocalDateTime;

import modulo13.entities.Order;
import modulo13.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        
        Order pedido = new Order(1001, LocalDateTime.now() , OrderStatus.Aguardando_Pagamento);

        System.out.println(pedido);
    }
}

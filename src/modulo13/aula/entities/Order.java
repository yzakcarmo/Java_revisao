package modulo13.aula.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import modulo13.aula.entities.enums.OrderStatus;

public class Order {
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private Integer id;
    private LocalDateTime momento;
    private OrderStatus status;

    public Order() {

    }

    public Order(Integer id, LocalDateTime momento, OrderStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public String toString() {
        return 
        "ID: " + id + "\n" +
        "Criação Pedido: " + fmt1.format(momento) + "\n" +
        "Status: " + status;
    }
}

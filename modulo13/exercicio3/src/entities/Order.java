package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private Client cliente;
    List<OrderItem> items = new ArrayList<>();

    public Order(Client cliente, OrderStatus status) {
        this.cliente = cliente;
        this.status = status;
    }
    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    public Order() {}

    public LocalDateTime getMoment() {
        return moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus pendingPayment) {
        this.status = pendingPayment;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    public Double total() {
        Double total = 0.0;
        for(OrderItem o : items) {
            total+=o.subTotal();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("ORDER SUMMARY:\n");
        output.append("Order moment: ");
        output.append(fmt1.format(moment) + "\n");
        output.append("Order status: " + status + "\n");
        output.append("Client: " + cliente.getName() + " ");
        output.append("(" + fmt2.format(cliente.getBirthDate()) + ")" + " - ");
        output.append(cliente.getEmail() + "\n");
        output.append("Order items:" + "\n");
        for(OrderItem i : items) {
            output.append(i.getProduto().getName() + ", $");
            output.append(String.format("%.2f", i.getProduto().getPrice()) + ", ");
            output.append("Quantity: " + i.getQuantity() + ", ");
            output.append("Subtotal: $");
            output.append(String.format("%.2f", i.subTotal()) + "\n");
        }
        output.append("Total price: $" + String.format("%.2f", total()));
    
        return output.toString();
    }
    
}

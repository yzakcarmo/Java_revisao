package modulo13.exercicio3.entities;

public class OrderItem {
    private Double price;
    private Integer quantity;
    private Product produto;    

    public OrderItem(Product produto, Integer quantity) {
        this.price = produto.getPrice();
        this.quantity = quantity;
        this.produto = produto;
    }
    
    public OrderItem() {}

    public Product getProduto() {
        return produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal() {
        return price * quantity;
    }
}

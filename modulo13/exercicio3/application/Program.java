package modulo13.exercicio3.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modulo13.exercicio3.entities.Order;
import modulo13.exercicio3.entities.OrderItem;
import modulo13.exercicio3.entities.Client;
import modulo13.exercicio3.entities.Product;
import modulo13.exercicio3.entities.enums.OrderStatus;


public class Program {
    public static void main(String[] args) {
        //Dados Mockados
        /*Client cliente = new Client("nome", LocalDate.parse("1998-08-20"), "email@email");
        Order pedido = new Order(cliente, OrderStatus.DELIVERED);
        Product produto1 = new Product("TV", 200.0);
        OrderItem item1 = new OrderItem(produto1, 2);
        pedido.addItem(item1);
        Product produto2 = new Product("PS4", 3000.0);
        OrderItem item2 = new OrderItem(produto2, 2);
        pedido.addItem(item2);*/

        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String name;
        String email;
        LocalDate nascimento;
        String productName;       
        Double productPrice;
        Integer productQuantity;
        int status;
        int n;     
        
        Order pedido = new Order();

        System.out.println("Dados do cliente:");
        System.out.print("Nome: ");
        name = scan.next();
        System.out.print("Email: ");
        email = scan.next();
        System.out.print("Nascimento (DD/MM/YYYY): ");
        nascimento = LocalDate.parse(scan.next(), fmt);
        Client cliente = new Client(name, nascimento, email);
        pedido.setCliente(cliente);

        System.out.println("\n" + "Dados do pedido:");
        System.out.print("Status (1 = Pendente Pagamento; 2 = Processando; 3 = Despachado; 4 = Entregue): ");
        status = scan.nextInt();
        do {
            switch (status) {
                case 1:
                    pedido.setStatus(OrderStatus.PENDING_PAYMENT);
                    break;
                case 2:
                    pedido.setStatus(OrderStatus.PROCESSING);
                    break;
                case 3:
                    pedido.setStatus(OrderStatus.SHIPPED);
                    break;
                case 4:
                    pedido.setStatus(OrderStatus.DELIVERED);
                    break;
            
                default:
                    System.out.println("Opção Invalida!!!");
                    System.out.print("Status (1 = Pendente Pagamento; 2 = Processando; 3 = Despachado; 4 = Entregue):");
                    status = scan.nextInt();
                    break;
            }                     
        } while (status <= 0 || status >= 5);
        
        System.out.print("Quantidade de itens: ");
        n = scan.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("\n" + "Dados item #" + i + ":");
            System.out.print("Nome do produto: ");
            productName = scan.next();            
            System.out.print("Preço do produto: ");
            productPrice = scan.nextDouble();
            Product produto = new Product(productName, productPrice);
            System.out.print("Quantidade: ");
            productQuantity = scan.nextInt();

            OrderItem item = new OrderItem(produto, productQuantity);
            pedido.addItem(item);
        }
        scan.close();

        System.out.println();
        System.out.println(pedido);
    }
}

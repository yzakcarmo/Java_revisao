package modulo15.exercicio2.application;

import java.util.Scanner;

import modulo15.exercicio2.model.entities.Account;
import modulo15.exercicio2.model.exceptions.BusinessException;

public class Program {
    public static void main(String[] args) {
        try {
            
            //Dados Teste
           /*Account conta = new Account(101, "Teste", 500.0, 200.0);
            System.out.println(conta);
            conta.deposit(100.0);
            conta.withdraw(601.0);
            System.out.println(conta);*/

            Scanner sc = new Scanner(System.in);
            Double amount;
            Double limit;
            String holder;
            Integer number;

            System.out.println("Dados da conta:");
            System.out.print("Dono: ");
            holder = sc.next();
            System.out.print("Número: ");
            number = sc.nextInt();
            System.out.print("Saldo: ");
            amount = sc.nextDouble();
            System.out.print("Limite Saque: ");
            limit = sc.nextDouble();
            Account conta = new Account(number, holder, amount, limit);
            System.out.println();
            System.out.println(conta);

            System.out.print("Valor de deposito: ");
            conta.deposit(sc.nextDouble());

            System.out.print("Valor de saque: ");
            conta.withdraw(sc.nextDouble());
            sc.close();

            System.out.println(conta);
        }
        catch(BusinessException e) {
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Erro inesperado");
        }       
    }
}

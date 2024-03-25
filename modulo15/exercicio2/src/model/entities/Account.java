package model.entities;

import model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }
    
    public void deposit(Double amount) {
        balance += amount;
        System.out.println("New balance: " + String.format("%.2f", balance));
        System.out.println();
    }

    public void withdraw(Double amount) {
        if(amount > balance) throw new BusinessException("Erro de saque: O valor excede o saldo");

        if(amount > withdrawLimit) throw new BusinessException("Erro de saque: O valor excede o limite de saque");

        balance -= amount;

        System.out.println("New balance: " + String.format("%.2f", balance));
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Account data: " + "\n");
        out.append("Number: ");
        out.append(number);
        out.append(", Holder: ");
        out.append(holder);
        out.append(", Balance: ");
        out.append(String.format("%.2f", balance));
        out.append("\n");
        return out.toString();
    }
}

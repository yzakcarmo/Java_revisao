package application;

import model.entities.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Teste1", "teste1@");
        Person p2 = new Person(2, "Teste2", "teste2@");
        Person p3 = new Person(3, "Teste3", "teste3@");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
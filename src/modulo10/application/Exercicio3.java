package modulo10.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo10.entities.Person;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade: ");
        int quant = scan.nextInt();
        String nome;
        int age;
        double height;
        Person[] pessoas = new Person[quant];

        for(int i = 0; i < pessoas.length; i++ ) {
            nome = scan.nextLine();
            System.out.print("Nome: ");
            nome = scan.nextLine();

            System.out.print("Idade: ");
            age = scan.nextInt();

            System.out.print("Altura: ");
            height = scan.nextDouble();
            System.out.print("\n");

            pessoas[i] = new Person(nome, age, height);
        }
        scan.close();

        System.out.printf("Media Alturas: %.2f", averageHeight(pessoas));
        under16(pessoas);
    }

    public static double averageHeight(Person[] pessoas) {
        double average = 0;
        for(Person obj : pessoas ) {
            average+= obj.getHeight();
        }
        return average/pessoas.length;
    }

    public static void under16 (Person[] pessoas) {
        double under = 0;
        List <String> nomes = new ArrayList<>();

        for(Person obj : pessoas) {
            if(obj.getAge() < 16) {
                under++;
                nomes.add(obj.getName());
            }
        }

        System.out.printf("Com menos de 16 anos: %.1f", (under/pessoas.length)*100);

        System.out.println();

        for( int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}

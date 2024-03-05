package modulo10.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo10.entities.Person;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int age;
        double height;

        System.out.print("Quantidade: ");
        int quant = scan.nextInt();
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

        /*
        Person[] pessoas = new Person[2];
        pessoas[0] = new Person("a", 16, 1.8);
        pessoas[1] = new Person("b", 1, 1.6);              
        */

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
            if(obj.getAge() < 17) {
                under++;
                nomes.add(obj.getName());
            }
        }
        System.out.printf("\n" + "Com menos de 16 anos: %.1f %%" + "\n", (under/pessoas.length)*100);
       
        for(String obj : nomes) {
            System.out.println(obj);  
        }
    }
}

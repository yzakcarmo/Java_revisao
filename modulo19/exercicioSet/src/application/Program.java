package application;

import entities.Student;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Set<Student> course = new LinkedHashSet<>();
        int n;
        String name;
        int cod;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantidade de alunos no curso A:");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Código do aluno:");
                cod = sc.nextInt();
                System.out.println("Nome do aluno:");
                name = sc.next();
                course.add(new Student(cod,name));
                System.out.println();
            }

            System.out.println("Quantidade de alunos no curso B:");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Código do aluno:");
                cod = sc.nextInt();
                System.out.println("Nome do aluno:");
                name = sc.next();
                course.add(new Student(cod,name));
                System.out.println();
            }

            System.out.println("Quantidade de alunos no curso C:");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Código do aluno:");
                cod = sc.nextInt();
                System.out.println("Nome do aluno:");
                name = sc.next();
                course.add(new Student(cod,name));
                System.out.println();
            }
            sc.close();

            System.out.println("Total alunos: " + course.size());
            for(Student item : course) {
                System.out.println(item);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

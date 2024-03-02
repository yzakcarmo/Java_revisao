package modulo08.entities;

public class Student {
    private String name;
    private double nota;

    public Student(String nome, double n1, double n2, double n3) {
        name = nome;
        nota = n1 + n2 + n3;
    }

    public void avalia() {
        System.out.printf("ALUNO: %s\n" + "NOTA FINAL: %.2f\n", name, nota);
        if(nota >=60) System.out.println("PASSOU DE ANO");
        else {
            System.out.println("NÃO PASSOU");
            System.out.printf("FALTOU %.2f PONTO(S)", 60-nota);
        }
    }
}

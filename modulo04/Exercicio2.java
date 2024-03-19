package modulo04;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area;
		raio = sc.nextDouble();
		
		area = 3.14159 *(raio*raio);
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}

}

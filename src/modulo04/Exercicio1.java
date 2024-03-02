package modulo04;

import java.util.Scanner;

public class Exercicio1 {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sc.close();
		System.out.println("SOMA = " + (num1+num2));

	}

}

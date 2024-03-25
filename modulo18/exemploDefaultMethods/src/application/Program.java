package application;

import model.services.BrazilInterestService;
import model.services.InterestService;

public class Program {

	public static void main(String[] args) {

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(200.0, 2);
		
		System.out.println("Payment after 2 months:");
		System.out.println(String.format("%.2f", payment));
	}
}
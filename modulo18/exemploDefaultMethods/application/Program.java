package modulo18.exemploDefaultMethods.application;

import modulo18.exemploDefaultMethods.model.services.BrazilInterestService;
import modulo18.exemploDefaultMethods.model.services.InterestService;

public class Program {

	public static void main(String[] args) {

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(200.0, 2);
		
		System.out.println("Payment after 2 months:");
		System.out.println(String.format("%.2f", payment));
	}
}
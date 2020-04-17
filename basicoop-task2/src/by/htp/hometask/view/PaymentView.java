package by.htp.hometask.view;

import by.htp.hometask.bean.Payment;
import by.htp.hometask.bean.Payment.Product;

public class PaymentView {

	public void printCheque(Payment pay) {
		
		System.out.println(pay.getName());
		for(Product c : pay.getProduct()) {
			
			System.out.println(c.getName());
			
		}
		System.out.println("Общая стоимость покупки " + pay.getTotal());
		
	}
}

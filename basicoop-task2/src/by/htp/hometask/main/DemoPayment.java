package by.htp.hometask.main;

import by.htp.hometask.logic.*;
import by.htp.hometask.bean.*;
import by.htp.hometask.view.*;


public class DemoPayment {
	public static void main(String [] args) {
		PaymentLogic logic = new PaymentLogic();
		PaymentView view = new PaymentView();
		
		Payment pay1 = new Payment("Первая покупка"); 
		Payment pay2 = new Payment("Вторая покупка"); 
	
		logic.setPayment(pay1);
		logic.setPayment(pay2);
		
		view.printCheque(pay1);
		view.printCheque(pay2);
	}
}

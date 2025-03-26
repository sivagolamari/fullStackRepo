package com.siva.upi;

import java.util.Random;

public class UpiPayment {

	public String doUpiPayment(String upiId,double amount ) {
		return "Payment Succesfull and Amount "+amount+" Debited From "+ upiId;
	}
	public double checkBalance(String upiId) {
		return new Random().nextInt(12000);
	}

}

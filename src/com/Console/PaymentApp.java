package com.Console;

import java.util.Scanner;

class Payment {
	void pay(double amount) {
		System.out.println("payment done");
	}
}

class PhonePe extends Payment {
	@Override
	void pay(double amount) {
		System.out.println("Paid " + amount + " using PhonePe");
		super.pay(amount);
	}
}

class GooglePay extends Payment {
	@Override
	void pay(double amount) {
		System.out.println("Paid " + amount + " using GooglePay");
		super.pay(amount);
	}
}

class CreditCard extends Payment {
	@Override
	void pay(double amount) {
		System.out.println("Paid " + amount + " using CreditCard");
		super.pay(amount);
	}
}

public class PaymentApp {

	void pay() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amount = 0;
		double totalAmount = 0;
		int finalTransaction = 0;
		String option;
		String input = "";
		do {
			System.out.println("phonepe");
			System.out.println("googlepay");
			System.out.println("creditcard");
			option = sc.next();

			Payment p;

			switch (option) {

			case "phonepe" -> p = new PhonePe();

			case "googlepay" -> p = new GooglePay();

			case "creditcard" -> p = new CreditCard();

			default -> {
				System.out.println("invalid payment method");
				continue;
			}
			}

			System.out.println("Enter amount");
			amount = sc.nextDouble();

			p.pay(amount);

			totalAmount = totalAmount + amount;

			finalTransaction++;
			System.out.println("do you want to continue(y/n");
			input = sc.next();
		} while (input.equals("y"));
		System.out.println("final transcation : " + finalTransaction);
		System.out.println("final Amount : " + totalAmount);
		sc.close();
	}

}

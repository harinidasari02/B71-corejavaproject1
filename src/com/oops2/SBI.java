package com.oops2;

public class SBI extends Bank {
	void Intrest() {
		System.out.println("sbi provides low intrest");
	}

	SBI() {
		super();
		System.out.println("SBI constructor called");
	}

	public static void main(String[] args) {
		SBI s = new SBI();
		s.Loan();
		s.Intrest();
	}

}

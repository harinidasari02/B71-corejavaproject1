package com.practice;

public class TestHome extends TestLoan {

	public static void main(String[] args) {
		System.out.println("enter your loan details:  ");
		TestHome t = new TestHome();
		System.out.println(t.cName());
		if(t.isValidatePan() && t.isValidatePhone()) {
			System.out.println("congrats you get the loan");
			System.out.println("your intrest is"+t.getROI());
			t.add();
			System.out.println("your details confirmed");
		}
	}

}

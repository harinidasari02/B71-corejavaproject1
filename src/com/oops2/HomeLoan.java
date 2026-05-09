package com.oops2;

import java.util.Scanner;

public class HomeLoan extends Loan {
	static Scanner sc = new Scanner(System.in);

	double getHROI() {
		return 5.2;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Home Loan!!");
		HomeLoan h1 = new HomeLoan();
		double salary = h1.getSalary();
		int age = h1.getAge();
		int cibilScore = h1.cibilScore();
		if (cibilScore > 650 && age > 22 && salary > 100000 && h1.isValidateAadhaar() && h1.isValidatePan()
				&& h1.isValidatePhone()) {
			System.out.println("Congratulations your eligible for Home loan!!");
			System.out.println("your Home loan intrest is: " + h1.getHROI());
			String add = h1.getAddress();
			System.out.println(add);
			h1.getConfirm();
		} else {
			System.out.println("Sorry your not eligible for Home loan!!");

		}
	}

}

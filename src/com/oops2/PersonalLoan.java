package com.oops2;

import java.util.Scanner;

public class PersonalLoan extends Loan {
	static Scanner sc = new Scanner(System.in);

	void display() {
		System.out.println("personal loan !!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan!!");
		PersonalLoan p1 = new PersonalLoan();
		double salary = p1.getSalary();
		int age = p1.getAge();
		int cibilScore = p1.cibilScore();
		if (cibilScore > 750 && age > 25 && salary > 1000000 && p1.isValidateAadhaar() && p1.isValidatePan()
				&& p1.isValidatePhone()) {
			System.out.println("Congratulations your eligible for Personal loan!!");
			System.out.println("your personal loan intrest is: " + p1.getROI());
			String add = p1.getAddress();
			System.out.println(add);
			p1.getConfirm();
		} else {
			System.out.println("Sorry your not eligible for personal loan!!");

		}
	}

}

package com.oops2;

import java.util.Scanner;

public class Loan {
	static Scanner sc = new Scanner(System.in);

	boolean isValidatePhone() {
		System.out.print("Enter your phone number: ");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	boolean isValidateAadhaar() {
		System.out.print("Enter your Aadhaar number: ");
		String Aadhaar = sc.next();
		return Aadhaar.matches("\\d{12}");
	}

	boolean isValidatePan() {
		System.out.print("Enter your Pan number: ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}\\d{4}[A-Z]");
	}

	double getSalary() {
		System.out.print("Enter Your Salary: ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getAge() {
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		return age;
	}

	int cibilScore() {
		System.out.print("Enter Your Cibil Score: ");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}

	double getROI() {
		return 10.5;
	}

	String getAddress() {
		System.out.print("Enter your flat no: ");
		sc.nextLine();
		String flat = sc.nextLine();
		System.out.println("enter your plot no: ");
		String plot = sc.nextLine();
		System.out.println("enter your street : ");
		String street = sc.nextLine();
		System.out.println("enter your pincode: ");
		String pincode = sc.next();
		return ("your Address details is : flat: " + flat + "plot: " + plot + "street: " + street + "pincode: "
				+ pincode);
	}

	void getConfirm() {
		System.out.println("Your details are confirmed!!");
	}
}

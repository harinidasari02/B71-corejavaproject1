package com.practice;

import java.util.Scanner;

public class TestLoan {
	static Scanner sc = new Scanner(System.in);

	boolean isValidatePhone() {
		System.out.println("Enter phone number: ");
		String pNo = sc.next();
		return pNo.matches("[6-9]{1}\\d{9}");
	}

	boolean isValidatePan() {
		System.out.println("enter your pan number: ");
		String panNo = sc.next();
		return panNo.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	String cName() {
		System.out.println("enter your name: ");
		String name = sc.next();
		return name;
	}

	double getROI() {
		return 10.5;
	}

	String add() {
		System.out.println("enter your details");
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

}

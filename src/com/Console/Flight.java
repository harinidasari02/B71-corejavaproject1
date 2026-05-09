package com.Console;

import java.util.Scanner;

public class Flight {

	static Scanner sc = new Scanner(System.in);

	String getName() {
		System.out.println("Enter Name:");
		return sc.next();
	}

	int getAge() {
		System.out.println("Enter Age:");
		return sc.nextInt();
	}

	String getSource() {
		System.out.println("Enter Source:");
		return sc.next();
	}

	String getDestination() {
		System.out.println("Enter Destination:");
		return sc.next();
	}

	int getPassengers() {
		System.out.println("Enter Number of Passengers:");
		return sc.nextInt();
	}

	boolean isValidAadhaar() {
		System.out.println("Enter Aadhaar Number:");
		String aadhaar = sc.next();
		return aadhaar.matches("\\d{12}");
	}

	boolean isValidPhone() {
		System.out.println("Enter Phone Number:");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	boolean isValidPassport() {
		System.out.println("Enter Passport Number:");
		String passport = sc.next();
		return passport.matches("[A-Z]{1}\\d{7}");
	}
}

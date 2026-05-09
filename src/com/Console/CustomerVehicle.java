package com.Console;

import java.util.Scanner;

public class CustomerVehicle extends Customer {

	static Scanner sc = new Scanner(System.in);

	public boolean isValidRegistrationNumber() {
		System.out.println("Registration Number :");
		String reg = sc.next();
		return reg.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}\\d{4}");
	}

	int getVehicleAge() {
		System.out.println("Vehicle Age :");
		int vage = sc.nextInt();
		return vage;
	}

	String getVehicleType() {
		System.out.println("Type of vehicle :");
		String type = sc.next();
		if (type.equals("car") || type.equals("bike") || type.equals("lorry")) {
			return type;
		} else {
			System.out.println("invalid vehicle type");
			return getVehicleType();
		}

	}
}

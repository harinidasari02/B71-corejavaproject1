package com.Console;

import java.util.Scanner;

public class Customer {

	static Scanner sc = new Scanner(System.in);

	String getCustomerAddressDetails() {
		String address = null;

		System.out.println("Enter your Flat number : ");
		String fno = sc.next();

		System.out.println("Enter your plot number  : ");
		sc.nextLine();
		String plot = sc.nextLine();

		System.out.println("ENter Your Street name ");
		String street = sc.nextLine();

		System.out.println("ENter Your City name ");
		String city = sc.nextLine();

		System.out.println("ENter Your PINCODE  ");
		long pin = sc.nextLong();

		address = "Flat NO : " + fno + " , Plot  :" + plot + " , Street : " + street + " , City : " + city + " , PIN : "
				+ pin;

		return address;
	}


	public boolean isValidPAN() {

		System.out.println("Enter PAN number :  ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	public boolean isValidPhone() {
		System.out.println("Enter your Phone numbe r: ");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	public boolean isValidAadhaar() {

		System.out.println("Enter 12 digit Aadhar number ");
		String aadhaar = sc.next();
		return aadhaar.matches("\\d{12}");
	}

	int getCustomerAge() {
		System.out.println("Customer Age :");
		int age = sc.nextInt();
		return age;
	}

	String getCustomerName() {
		System.out.println("Customer Name :");
		String name = sc.next();
		return name;
	}



}

package com.logicalStatements;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ride Booking App");
		System.out.println("Enter your city");
		String city = sc.next();
		if (city.equals("hyderabad")) {
			System.out.println("number of drivers available");
			int driver = sc.nextInt();
			if (driver > 0) {
				System.out.println("enter distance in km");
				int distance = sc.nextInt();
				if (distance >= 2 && distance <= 20) {
					System.out.println("Enter vehicle type(bike/car/auto)");
					String type = sc.next();
					if (type.equals("bike") || type.equals("auto") || type.equals("car")) {
						if (distance <= 5) {
							System.out.println("fixed fare");
						} else {
							System.out.println("normal fare");
						}
						System.out.println("peak time(true/false)?");
						boolean peak = sc.nextBoolean();
						if (peak) {
							System.out.println("fare increase by 50%");
						}
						System.out.println("confirm booking(true/false)");
						boolean confirm = sc.nextBoolean();
						if (confirm) {
							System.out.println("driver accepted(true/false)");
							boolean accept = sc.nextBoolean();
							if (accept) {
								System.out.println("payment method(cash/online)");
								String payment = sc.next();
								if (payment.equals("online")) {
									System.out.println("payment success(true/false)?");
									boolean success = sc.nextBoolean();
									if (success) {
										System.out.println("payment success");
									} else {
										System.out.println("retry payment");
									}
								} else {
									System.out.println("pay to driver");
								}
								System.out.println("give rating(1-5)");
								int rating = sc.nextInt();
								if (rating < 3) {
									System.out.println("we will improve");
								} else {
									System.out.println("thanks for your feedback");
								}
								System.out.println("ride completed successfully");
							} else {
								System.out.println("Searching for another driver");
							}
						} else {
							System.out.println("ride cancelled");
						}
					} else {
						System.out.println("Invalid vehicle type");
					}
				} else if (distance < 2) {
					System.out.println("Minimum distance not met");
				} else {
					System.out.println("outstation not supported");
				}
			} else {
				System.out.println("No drivers available");
			}
		} else {
			System.out.println("service not available in your location");
		}
		sc.close();
	}

}

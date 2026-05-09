package com.Console;

public class FlightBooking extends Flight {

	String getFlightClass() {
		System.out.println("Choose Class (economy/business/first):");
		return sc.next();
	}

	boolean checkSeats() {
		System.out.println("Seats available? (true/false):");
		return sc.nextBoolean();
	}

	double calculateFare(String type, int passengers, int age) {

		double fare = 5000 * passengers;

		if (type.equals("business")) {
			fare += fare * 0.5;
		}

		if (type.equals("first")) {
			fare += fare * 1.0;
		}

		if (age > 60) {
			fare -= fare * 0.2;
		}

		return fare;
	}

	boolean paymentProcess() {
		System.out.println("Payment method (online/cash):");
		String method = sc.next();

		if (method.equals("online")) {
			System.out.println("Payment success? (true/false):");
			return sc.nextBoolean();
		} else {
			System.out.println("Pay at counter");
			return true;
		}
	}

	void rating() {
		System.out.println("Give rating (1-5):");
		int r = sc.nextInt();

		if (r < 3) {
			System.out.println("We will improve service");
		} else {
			System.out.println("Thanks for feedback");
		}
	}
}
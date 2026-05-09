package com.Console;

public class PremiumFlightBooking extends FlightBooking {

	public static void main(String[] args) {

		PremiumFlightBooking fb = new PremiumFlightBooking();

		System.out.println(" Flight Booking System Started");

		String name = fb.getName();
		int age = fb.getAge();

		String source = fb.getSource();
		String destination = fb.getDestination();

		int passengers = fb.getPassengers();
		boolean docsValid =
				fb.isValidAadhaar() &&
				fb.isValidPhone() &&
				fb.isValidPassport();

		if (!docsValid) {
			System.out.println("Invalid Documents  Booking Rejected");
			return;
		}

		if (!source.equals(destination)) {

			System.out.println("Route Available ");

			String type = fb.getFlightClass();

			if (fb.checkSeats()) {

				double fare = fb.calculateFare(type, passengers, age);

				System.out.println("Final Fare: " + fare);

				System.out.println("Confirm booking? (true/false):");
				boolean confirm = sc.nextBoolean();

				if (confirm) {

					if (fb.paymentProcess()) {

						System.out.println("Payment Successful ");

						fb.rating();

						System.out.println(" Ticket Booked Successfully");

					} else {
						System.out.println("Payment Failed ");
					}

				} else {
					System.out.println("Booking Cancelled ");
				}

			} else {
				System.out.println("No Seats Available ");
			}

		} else {
			System.out.println("Invalid Route ");
		}
	}
}

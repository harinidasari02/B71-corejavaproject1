package com.Console;

import java.util.Scanner;

public class Movie {

	static void movie() {
		System.out.println("1.pushpa");
		System.out.println("2.rrr");
		System.out.println("3.pushpa2");
		System.out.println("4.aarya");
	}

	static void theatre() {
		System.out.println("1.aaa");
		System.out.println("2.amb");
	}

	static void ticket() {
		System.out.println("1.silver-100");
		System.out.println("2.gold-200");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double totalBill = 0;
		int totalTickets = 0;

		String option;

		do {

			int price = 0;
			double bill = 0;

			String movieName = "";
			String theatreName = "";
			String ticketType = "";

			movie();

			System.out.println("Enter movie name");
			String movieChoice = sc.next();

			switch (movieChoice) {

			case "pushpa", "rrr", "pushpa2", "aarya" -> {

				movieName = movieChoice;

				theatre();

				System.out.println("Enter theatre name");
				String theatreChoice = sc.next();

				switch (theatreChoice) {

				case "aaa", "amb" -> {

					theatreName = theatreChoice;

					while (price == 0) {

						ticket();

						System.out.println("Enter ticket type");
						String ticket = sc.next();

						price = switch (ticket) {

						case "silver" -> {
							ticketType = ticket;
							System.out.println("silver selected");
							yield 100;
						}

						case "gold" -> {
							ticketType = ticket;
							System.out.println("gold selected");
							yield 200;
						}

						default -> {
							System.out.println("invalid ticket type");
							yield 0;
						}
						};
					}

					System.out.println("Enter quantity");
					int quantity = sc.nextInt();

					bill = price * quantity;

					totalBill = totalBill + bill;

					totalTickets = totalTickets + quantity;

					System.out.println("\n===== BOOKING INVOICE =====");
					System.out.println("Movie Name : " + movieName);
					System.out.println("Theatre    : " + theatreName);
					System.out.println("Ticket Type: " + ticketType);
					System.out.println("Quantity   : " + quantity);
					System.out.println("Bill       : " + bill);

				}

				default -> System.out.println("invalid theatre");
				}
			}

			default -> System.out.println("invalid movie choice");
			}

			System.out.println("\nDo you want to continue(y/n)");
			option = sc.next();

		} while (option.equalsIgnoreCase("y"));

		System.out.println("\n===== FINAL INVOICE =====");
		System.out.println("Total Tickets : " + totalTickets);
		System.out.println("Final Bill    : " + totalBill);

		sc.close();
	}
}

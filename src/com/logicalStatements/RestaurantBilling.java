package com.logicalStatements;

import java.util.Scanner;

public class RestaurantBilling {

	void displayMenu() {
		System.out.println("\n========= MENU =========");
		System.out.println("1. Veg Biryani      - 250");
		System.out.println("2. Chicken Biryani  - 300");
		System.out.println("3. Pizza            - 150");
		System.out.println("4. Burger           - 120");
		System.out.println("5. Cool Drink       - 40");
		System.out.println("6. Water Bottle     - 20");
		System.out.println("7. Exit");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RestaurantBilling r = new RestaurantBilling();

		double grandTotal = 0;

		int totalQuantity = 0;

		String choice = "yes";

		String bill = "";

		do {

			r.displayMenu();

			System.out.print("Select Item : ");
			int item = sc.nextInt();

			if (item == 7) {
				break;
			}

			int price = 0;

			String itemName = "";

			switch (item) {

			case 1 -> {
				itemName = "Veg Biryani";
				price = 250;
			}

			case 2 -> {
				itemName = "Chicken Biryani";
				price = 300;
			}

			case 3 -> {
				itemName = "Pizza";
				price = 150;
			}

			case 4 -> {
				itemName = "Burger";
				price = 120;
			}

			case 5 -> {
				itemName = "Cool Drink";
				price = 40;
			}

			case 6 -> {
				itemName = "Water Bottle";
				price = 20;
			}

			default -> {
				System.out.println("Invalid Item");
				continue;
			}
			}

			System.out.print("Enter Quantity : ");
			int quantity = sc.nextInt();

			double total = quantity * price;

			totalQuantity += quantity;

			grandTotal += total;

			bill += itemName + " x " + quantity + " = " + total + "\n";

			System.out.print("Do you want to add more items (yes/no): ");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("yes"));

		System.out.println("\n========== FINAL INVOICE ==========");

		System.out.println(bill);

		System.out.println("Total Quantity : " + totalQuantity);

		System.out.println("Grand Total    : " + grandTotal);

		System.out.println("Thank You Visit Again!");

		sc.close();
	}
}
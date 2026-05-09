package com.practice;

import java.util.Scanner;

public class ShoppingCart {
	int price;
	int quantity;
	int items;

	void addItem(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
		++items;
	}

	int getFinalAmount() {
		int total = price * quantity;
		int discount = (total / 1500) * 300;
		return total - discount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart s = new ShoppingCart();
		System.out.print("Enter the price: ");
		s.price = sc.nextInt();
		System.out.print("Enter the quantity: ");
		s.quantity = sc.nextInt();
		s.addItem(s.price, s.quantity);
		System.out.println("Items in Cart: " + s.items);
		System.out.println("Final Amount: " + s.getFinalAmount());
		sc.close();
	}

}

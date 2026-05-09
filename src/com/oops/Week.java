package com.oops;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "null";
		do {
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			switch (num) {
			case 1 -> System.out.println("monday");
			case 2 -> System.out.println("tuesday");
			case 3 -> System.out.println("wednesday");
			case 4 -> System.out.println("thrusday");
			case 5 -> System.out.println("friday");
			case 6 -> System.out.println("saturday");
			case 7 -> System.out.println("sunday");
			default -> System.out.println("enter vaid number(1-7)");
			}
			System.out.println("Do you want to continue (y/n)?");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		sc.close();

	}
}

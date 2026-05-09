package com.logicalStatements;

import java.util.Scanner;

// WAP to find Student grades based on the percentage
public class TestLS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		double d = sc.nextDouble();
		if (d > 100 || d < 0) {
			System.out.println("Enter valid percentage");
		} else if (d >= 90) {
			System.out.println("A Grade");
		} else if (d >= 70) {
			System.out.println("B Grade");
		} else if (d >= 50) {
			System.out.println("C Grade");
		} else if (d >= 35) {
			System.out.println("just pass");
		} else {
			System.out.println("Failed");
		}
		sc.close();
	}
}

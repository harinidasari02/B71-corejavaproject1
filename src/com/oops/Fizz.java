package com.oops;

import java.util.Scanner;

public class Fizz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		if (x % 3 == 0 && x % 5 == 0) {
			System.out.println("fizz");
		} else if (x % 5 == 0) {
			System.out.println("buzz");
		} else if (x % 3 == 0) {
			System.out.println("fizz buzz");
		} else {
			System.out.println(x);
		}
		sc.close();
	}

}

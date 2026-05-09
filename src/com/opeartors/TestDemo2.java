package com.opeartors;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		System.out.print("Enter b value: ");
		int b = sc.nextInt();
		System.out.print("Enter Operator: ");
		char s = sc.next().charAt(0);
		if (s == '+') {
			System.out.println(a + b);
		} else if (s == '-') {
			System.out.println(a - b);
		} else if (s == '*') {
			System.out.println(a * b);
		} else if (s == '/') {
			System.out.println(a / b);
		} else if (s == '%') {
			System.out.println(a % b);
		} else {
			System.out.println("Enter valid Operator");
		}
		sc.close();
	}

}

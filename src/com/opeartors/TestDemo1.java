package com.opeartors;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		System.out.println("Enter c value: ");
		int c = sc.nextInt();
		if (a >= b && a >= c) {
			System.out.println("a is larger!!" + a);
		} else if (b >= a && b >= c) {
			System.out.println("b is larger!!" + b);
		} else {
			System.out.println("c is larger!!" + c);
		}
		sc.close();
	}

}

package com.logical;

import java.util.Scanner;

public class LogicalConditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a value: ");
		int a = sc.nextInt();
		System.out.println("enter the b value: ");
		int b = sc.nextInt();
		System.out.println("enter the c value: ");
		int c = sc.nextInt();
		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max);
		sc.close();
	}
}

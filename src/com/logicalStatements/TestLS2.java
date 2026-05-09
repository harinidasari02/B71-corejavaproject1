package com.logicalStatements;

import java.util.Scanner;

public class TestLS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age <= 5) {
			System.out.println("you are kid");
		} else if (age <= 12) {
			System.out.println("you are child");
		} else if (age <= 20) {
			System.out.println("you are teen");
		} else if (age <= 35) {
			System.out.println("you are young");
		} else if (age <= 60) {
			System.out.println("you are middle age");
		} else if (age <= 100) {
			System.out.println("old age");
		} else {
			System.out.println("enter valid age");
		}
		sc.close();
	}
}

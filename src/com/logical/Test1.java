package com.logical;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String s = sc.next();
		System.out.println("Enter password: ");
		int p = sc.nextInt();
		if (s.equals("admin") && p==1234) {
			System.out.println("login sucess");
		} else {
			System.out.println("invalid");
		}
		sc.close();
		int age=9;
		if (age > 10)
		    System.out.println("login sucess");
		else
		    System.out.println("invalid");
	}

}

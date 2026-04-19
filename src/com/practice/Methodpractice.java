package com.practice;
import java.util.Scanner;
public class Methodpractice {
	static void display(String firstName,String lastName) {
		System.out.println("FULL NAME :"+firstName+lastName);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String f1=sc.next();
		System.out.println("enter last name:");
		String f2=sc.next();
		System.out.println("ENTER YOUR AGE: ");
		int a=sc.nextInt();
		System.out.println("Enter your gender: ");
		char c=sc.next().charAt(0);
		display(f1,f2);
		method1(a);
		method2(c);
		sc.close();
	}
	static void method1(int age) {
		System.out.println("your age is: "+age);
	}
	static void method2(char c) {
		System.out.println("your gender is: "+c);
	}
}

package com.practice;
import java.util.Scanner;
public class Methodpractice4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		ageInfo(age);

		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();

		getNameInfo(firstName, lastName);

		System.out.println("ENter Gender info : ");
		char gen = sc.next().charAt(0);//method chaining 
		genderInfo(gen);
		sc.close();

	}

	static void genderInfo(char c) {
		System.out.println("Gender info is : " + c);
	}

	static void ageInfo(int age) {
		System.out.println("Student Age : " + age);
	}

	static void getNameInfo(String fname, String lname) {
		System.out.println("Full Name of the Student : " + fname + lname);
	}
	}



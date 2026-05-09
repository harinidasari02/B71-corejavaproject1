package com.logicalStatements;

import java.util.Scanner;

//WAP to work with a simple matrimonial related info validation check..?name,salary,assests,age,height,weight,sibling status
public class TestLS1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!!");
		System.out.print("Enter your Full Name:");
		String name = sc.nextLine();
		System.out.println("Welcome Mr:" + name);
		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter your assets");
		double assets = sc.nextDouble();
		if (salary >= 700000 && assets >= 10000000) {
			System.out.println("Oh Great !! Will continue the discussion");
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			if (age >= 25 && age <= 30) {
				System.out.println("Your age is matching with our profile lets continue !");
				System.out.println("enter your height");
				float height = sc.nextFloat();
				if (height >= 5.6 && height <= 6.0) {
					System.out.println("ok to continue ");
					System.out.println("enter your weight");
					double weight = sc.nextDouble();
					if (weight <= 80 && weight >= 70) {
						System.out.println("good to go");
						System.out.println("do you have any siblings(true/false)");
						boolean sibStatus = sc.nextBoolean();
						if (!sibStatus) {
							System.out.println("we are okay to communicate later");
						} else {
							System.out.println("connect later");
						}
					} else {
						System.out.println("You must need to join in GYm !!");
					}
				} else {
					System.out.println("You are too short or too long ");
				}
			} else {
				System.out.println("Your age does not match with our profile !!");
			}
		} else {
			System.out.println("your salary and assets not matched");
		}
		sc.close();
	}

}

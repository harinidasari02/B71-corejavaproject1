package com.constructors;
import java.util.Scanner;
public class Employee1 {
	static Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int value;
	Employee1(){
		System.out.print("Enter the id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("enter the name: ");
		name=sc.nextLine();
		System.out.print("enter value");
		value=sc.nextInt();
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(value);
	}
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.display();
	}

}

package com.oops2;

public class Student extends Person {
	String name = "dasari";

	void display() {
		System.out.println(super.name);;
		super.display();
		System.out.println("this is child class display");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}

}

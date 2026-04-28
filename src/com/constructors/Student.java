package com.constructors;

public class Student {
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	void display() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		Student s=new Student(10, "harini", 100);
		s.display();
	}
}

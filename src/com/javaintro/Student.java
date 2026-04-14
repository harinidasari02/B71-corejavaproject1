package com.javaintro;
public class Student {
	int id;
	String name;
	int marks;
	void method(int i,String n,int m) {
		id=i;
		name=n;
		marks=m;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.method(01,"harini",10);
		s1.display();
		
	}
}
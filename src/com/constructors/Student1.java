package com.constructors;

public class Student1 {
	int id;
	String name;
	long phone;
	int marks;
	Student1(){
		System.out.println("details not available");
	}
	Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Student1(int id, String name, long phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	Student1(int id, String name, long phone, int marks) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.marks = marks;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.display();
		Student1 s1=new Student1(10,"harini");
		s1.display();
		Student1 s2=new Student1(11, "hari", 7997880l);
		s2.display();
		Student1 s3=new Student1(12, "hary", 944101l, 100);
		s3.display();
	}

}

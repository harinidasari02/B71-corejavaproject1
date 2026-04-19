package com.practice;
import java.util.Scanner;
public class MethodPractice14 {
	static Scanner sc=new Scanner(System.in);
	class Student{
		int id;
		String name;
		int marks;
	}
	Student getDetails(){
		Student s=new Student();
		System.out.print("enter id: ");
		s.id=sc.nextInt();
		System.out.print("enter name: ");
		sc.nextLine();
		s.name=sc.nextLine();
		System.out.print("enter marks: ");
		s.marks=sc.nextInt();
		return s;
	}
	void display(Student d) {
		System.out.println("ID: "+d.id);
		System.out.println("Name: "+d.name);
		System.out.println("Marks: "+d.marks);
	}
	Student update(Student e) {
		System.out.println("updating marks:");
		e.marks+=10;
		return e;
	}
	Student updated(Student f) {
		System.out.println("doubling marks:");
		f.marks=2*f.marks;
		return f;
	}
	public static void main(String[] args) {
		MethodPractice14 m1=new MethodPractice14();
		Student s1=m1.getDetails();
		m1.display(s1);
		Student s2=m1.update(s1);
		m1.display(s2);
		Student s=m1.updated(s1);
		m1.display(s);
	sc.close();
	}

}

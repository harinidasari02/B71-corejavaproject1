package com.practice;
import java.util.Scanner;
public class MethodPractice12 {
	static Scanner sc=new Scanner(System.in);
	class ObjectBased{
		int id;
		String name;
	}
	ObjectBased getInput() {
		ObjectBased o1=new ObjectBased();
		o1.id=sc.nextInt();
		sc.nextLine();
		o1.name=sc.nextLine();
		return o1;
	}
	void display(ObjectBased o) {
		System.out.println(o.id);
		System.out.println(o.name);
	}
	public static void main(String[] args) {
		MethodPractice12 m1=new MethodPractice12();
		ObjectBased obj=m1.getInput();
		m1.display(obj);
		sc.close();
	}

}

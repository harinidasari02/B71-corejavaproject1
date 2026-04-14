package com.javaintro;

public class students {
	int id,marks;
	String name;
	void m(int i,int m,String n) {
		id=i;
		marks=m;
		name=n;	
	}
	void m1() {
		System.out.println(id);
		System.out.println(marks);
		System.out.println(name);
	}
	public static void main(String[] args) {
		students s1=new students();
		s1.m(01,100,"hari");
		s1.m1();

	}

}

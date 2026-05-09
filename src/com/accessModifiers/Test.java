package com.accessModifiers;

public class Test {
	int age = 20;
	private String name = "harini";

	Test() {
		System.out.println("no arg constructor called");
	}

	private void display() {
		System.out.println("private method called");
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.age);
		System.out.println(t.name);
		t.display();
	}

}
//	public static void main(String[] args) {
//		int x = 0;
//		boolean res = (x > 0) && (++x > 0);
//		System.out.println(x + " " + res);
//	}

package com.methods;

public class Arthematic {
	static int a=50;
	static int b=20;
//	sum
	static void add() {
		System.out.println(a+b);
	}
//	difference
	static void sub() {
		System.out.println(a-b);
	}
//product
	static void mul() {
		System.out.println(a*b);
	}
//quotient
	static void div() {
		System.out.println(a/b);
	}
//remainder
	static void mod() {
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}

}

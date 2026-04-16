package com.methods;

public class Arthematic {
//	sum
	static void add(byte a,int b) {
		System.out.println(a+b);
	}
//	difference
	static void sub(int a,int b) {
		System.out.println(a-b);
	}
//product
	static void mul(int a,int b) {
		System.out.println(a*b);
	}
//quotient
	static void div(int a,int b) {
		System.out.println(a/b);
	}
//remainder
	static void mod(int a,int b) {
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		add((byte)10,20);
		sub(10,20);
		mul(10,20);
		div(10,20);
		mod(10,20);
	}

}

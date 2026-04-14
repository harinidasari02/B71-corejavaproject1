package com.methods;

public class Behaviour {
//	static+argument+no return type
	static void add(long a,float b) {
		System.out.println(a+b);
	}
	static void add1(long a,double b) {
		System.out.println(a+b);
	}
	static void add2(long a,char b) {
		System.out.println(a+b);
	}
	static void add3(long a,short b) {
		System.out.println(a+b);
	}
	static void add4(long a,float b) {
		System.out.println(a+b);
	}
	static void add7(long a,short b) {
		System.out.println(a+b);
	}
//static+argument+no return type
	public static void main(String[] args) {
		add(10,20);
		add1(10,20);
		add2(10,(char)20);
		add3(10,(short)20);
		add4(10,20);
	}
}

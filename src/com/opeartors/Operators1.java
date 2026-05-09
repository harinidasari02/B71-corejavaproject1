package com.opeartors;

import java.util.Scanner;

public class Operators1 {
	static Scanner sc=new Scanner(System.in);
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}
	int mod(int a,int b) {
		return a%b;
	}
	void display(int a,int b) {
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		System.out.println(mod(a,b));
	}
	public static void main(String[] args) {
		Operators1 o=new Operators1();
		System.out.println("enter a value: ");
		int a=sc.nextInt();
		System.out.println("enter b value: ");
		int b=sc.nextInt();
		o.display(a, b);
	}

}

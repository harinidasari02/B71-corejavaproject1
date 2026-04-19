package com.practice;
import java.util.Scanner;
public class MethodPractice10 {
	static Scanner sc=new Scanner(System.in);
	static void method1() {
		System.out.print("enter the message: ");
		String s=sc.nextLine();
		System.out.println("print the method:"+s);
	}
	void method2(int a,int b) {
		int c=a+b;
		System.out.println("sum is: "+c);
	}
	static int method3() {
		System.out.print("Enter Integer Value:");
		int a=sc.nextInt();
		return a;
	}
	int method4(int a,int b) {
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		MethodPractice10 m1=new MethodPractice10();
		method1();
		System.out.print("Enter a value:");
		int a=sc.nextInt();
		System.out.print("Enter b value: ");
		int b=sc.nextInt();
		m1.method2(a,b);
		int c=method3();
		System.out.println("the integer value is:"+c);
		int d=m1.method4(a, b);
		System.out.println("the multiplication value is:"+d);
		sc.close();
	}

}

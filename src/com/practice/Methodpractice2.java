package com.practice;
import java.util.Scanner;
// with arguments+console based input+no return type+static&instance.
public class Methodpractice2 {
	static void method1(byte a,byte b) {
		System.out.println("sum is: "+(a+b));
	}
	void display(int age) {
		System.out.println("your age is: "+age);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Methodpractice2 m1 =new Methodpractice2();
		System.out.println("enter your age:");
		int age=sc.nextInt();
		m1.display(age);
		System.out.println("enter a value:");
		byte a=sc.nextByte();
		System.out.println("enter b value:");
		byte b=sc.nextByte();
		method1(a,b);
		System.out.println("enter a value: ");
		short diff=sc.nextShort();
		System.out.println("enter b value: ");
		short diff2=sc.nextShort();
		m1.method3(diff,diff2);
		System.out.println("enter l1 value: ");
		long l1=sc.nextLong();
		System.out.println("enter l2 value: ");
		long l2=sc.nextLong();
		method4(l1,l2);
		System.out.println("enter f1 value:");
		float f1=sc.nextFloat();
		System.out.println("enter f2 value: ");
		float f2=sc.nextFloat();
		method5(f1,f2);
		System.out.println("enter d1 value:");
		double d1=sc.nextDouble();
		System.out.println("enter d2 value: ");
		double d2=sc.nextDouble();
		method6(d1,d2);
	}
	void method3(short diff1,short diff2) {
		System.out.println("difference is:"+(diff2-diff1));
	}
	static void method4(long l1,long l2) {
		System.out.println("product is:"+(l1*l2));
	}
	static void method5(float f1,float f2) {
		System.out.println("quoitent is:"+(f1/f2));
	}
	static void method6(double d1,double d2) {
		System.out.println("reaminder is: "+(d1%d2));
	}
}

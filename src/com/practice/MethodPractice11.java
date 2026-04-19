package com.practice;
import java.util.Scanner;
public class MethodPractice11 {
	static Scanner sc=new Scanner(System.in);
	static void getInt(int a) {
		System.out.println("print the number:"+a);
	}
	int getTwo() {
		return 1000;
	}
	public static void main(String[] args) {
		MethodPractice11 m1=new MethodPractice11();
		System.out.print("enter the number: ");
		int a=sc.nextInt();
		getInt(a);
		int d=m1.getTwo();
		System.out.println(d);
		sc.close();
	}

}

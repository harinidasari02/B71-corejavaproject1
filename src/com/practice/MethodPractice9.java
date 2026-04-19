package com.practice;
import java.util.Scanner;
public class MethodPractice9 {
	static Scanner sc=new Scanner(System.in);
//	without arg+ with return type.
	static int add() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		return a+b;
		
	}
//with return+args.
	static int sub(int a,int b) {
		int result=a-b;
		return result;
	}
//with args+no return type.
	static void mul(int c,int d) {
		int e=c*d;
		System.out.println(e);
	}
//without args+no return type.
	static void div() {
		int div1=sc.nextInt();
		int div2=sc.nextInt();
		int result=div1/div2;
		System.out.println(result);
	}
	public static void main(String[] args) {
		int sum=add();
		System.out.println(sum);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=sub(a,b);
		System.out.println(result);
		int c=sc.nextInt();
		int d=sc.nextInt();
		mul(c,d);
		div();
		
	}

}

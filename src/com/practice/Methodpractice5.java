package com.practice;
import java.util.Scanner;
//return type+no arguments.
public class Methodpractice5 {
	static double add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("emter a value:");
		double a=sc.nextDouble();
		System.out.println("enter b value");
		double b=sc.nextDouble();
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("addition:"+add());
		System.out.println(add()+2);
}
}
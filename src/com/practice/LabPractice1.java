package com.practice;
import java.util.Scanner;
public class LabPractice1 {
	static Scanner sc=new Scanner(System.in);
	static double balance=1000;
	static double getDeposit(double deposit) {
		double result=deposit+balance;
		return result;
	}
	static double getWithdraw(double withdraw) {
		return withdraw;
	}
	public static void main(String[] args) {
		System.out.println("enter deposit:");
		double deposit=sc.nextDouble();
		System.out.println("enter withdraw:");
		double withdraw=sc.nextDouble();
		double finalResult=getDeposit(deposit)-withdraw;
		System.out.println("final result is:"+finalResult);
		sc.close();

	}

}

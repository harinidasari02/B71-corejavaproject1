package com.practice;
import java.util.Scanner;
public class LabPractice {
	static void method1(int price,int quantity,float deliveryCharge,int discount) {
		double totalAmount=price*quantity;
		double discountAmount=(totalAmount*discount)/100;
		double afterDiscount=totalAmount-discountAmount;
		double totalBill=afterDiscount+deliveryCharge;
		System.out.println("Total Bill:"+totalBill);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price:");
		int price=sc.nextInt();
		System.out.println("enter quantity:");
		int t=sc.nextInt();
		System.out.println("enter delivery charge:");
		float deliveryCharge=sc.nextFloat();
		System.out.println("enter discount:");
		int discount=sc.nextInt();
		
		method1(price,t,deliveryCharge,discount);
		sc.close();
	}
}
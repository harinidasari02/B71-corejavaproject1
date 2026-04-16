package com.practice;

public class LabPractice {
	static void method1(int price,int quantity,float deliveryCharge,int discount) {
		double totalAmount=price*quantity;
		double discountAmount=(totalAmount*discount)/100;
		double afterDiscount=totalAmount-discountAmount;
		double totalBill=afterDiscount+deliveryCharge;
		System.out.println("Total Bill:"+totalBill);
		
	}
	public static void main(String[] args) {

		method1(1000,02,50,5);
	}

}

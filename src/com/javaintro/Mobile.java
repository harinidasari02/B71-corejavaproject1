package com.javaintro;

public class Mobile {
	int price=20000;
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		m2.price=15000;
		System.out.println(m1.price);
	}

}

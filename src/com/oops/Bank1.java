package com.oops;

public class Bank1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAccountNumber(10000);
		b.setBalance(-10);
		b.setHolderName("harini");
		System.out.println(b.getAccountNumber());
		System.out.println(b.getBalance());
		System.out.println(b.getHolderName());
	}
}

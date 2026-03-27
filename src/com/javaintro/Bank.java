package com.javaintro;

public class Bank {
	int AccountNumber;
	String AccountHolderName;
	int Balance;
	
	static String Branch;
	static String BankName;

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.AccountNumber=100;
		b1.AccountHolderName="Harini";
		b1.Balance=2000;
		
		Bank b2=new Bank();
		b2.AccountNumber=101;
		b2.AccountHolderName="malleswari";
		b2.Balance=2000;
		
		Bank b3=new Bank();
		b3.AccountNumber=102;
		b3.AccountHolderName="Harini";
		b3.Balance=2000;
		
		Branch="Karimnagar";
		BankName="HDFC BANK";
		System.out.println("person-1:");
		System.out.println("AccountNumber:"+b1.AccountNumber);
		System.out.println(b1.AccountHolderName);
		System.out.println(b1.Balance);
		System.out.println(Branch);
		System.out.println(BankName);
		System.out.println();
		
		System.out.println("person-2:");
		System.out.println(b2.AccountNumber);
		System.out.println(b2.AccountHolderName);
		System.out.println(b2.Balance);
		System.out.println(Branch);
		System.out.println(BankName);
		System.out.println();
		
		System.out.println("person-3:");
		System.out.println(b3.AccountNumber);
		System.out.println(b3.AccountHolderName);
		System.out.println(b3.Balance);
		System.out.println(Branch);
		System.out.println(BankName);
		
	}

}

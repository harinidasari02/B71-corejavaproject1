package com.oops;

public class Bank {
	private int accountNumber;
	private String holderName;
	private double balance;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance=balance;
		}
	}
}

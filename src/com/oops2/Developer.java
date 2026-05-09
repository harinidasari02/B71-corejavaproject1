package com.oops2;

public class Developer extends Employee {
	@Override
	void work() {
		System.out.println("Developer is writing code..");
	}

	public static void main(String[] args) {
		Developer d=new Developer();
		d.login();
		d.getDetails();
		d.work();
	}

}

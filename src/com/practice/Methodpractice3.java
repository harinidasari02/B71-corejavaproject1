package com.practice;
//with return type+no arguments.
public class Methodpractice3 {
	public static void main(String[] args) {
		System.out.println("main method started ");

		double salary = getEmpSalInfo();
		double bonus = getBonus();
		
		System.out.println("Total Salary is : " + (salary + bonus));

		System.out.println("main method ended ");
	}

	static double getEmpSalInfo() {
		double sal = 50000.00;
		return sal;
	}

	static double getBonus() {
		double bonus = 4000.00;
		return bonus;
	}

}

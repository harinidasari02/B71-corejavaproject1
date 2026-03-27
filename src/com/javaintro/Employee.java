package com.javaintro;

public class Employee {
	int empId;
	String employeeName;
	static double salary=5000;
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.employeeName="Ramu";
		e1.empId=101;
		salary=salary-0.03*salary-0.07*salary+0.05*salary;
		System.out.println("name:"+e1.employeeName);
		System.out.println("id:"+e1.empId);
		System.out.println("Monthly salary: "+salary);
		System.out.println("Annual salary: "+(salary*12));
	}

}

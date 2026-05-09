package com.oops;

public class Employee2 {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.setId(10);
		e.setName("harini");
		e.setSalary(30000.0);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}

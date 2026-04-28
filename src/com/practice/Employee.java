package com.practice;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	Employee(Employee e,double salary){
		this.id=e.id;
		this.name=e.name;
		this.salary=salary;
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee(10,"harini");
		e.show();
		Employee e1=new Employee(e,2500.6);
		e1.show();
	}

}

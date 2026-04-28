package com.constructors;
//no arg constructor
public class Employee {
	int eid;
	String name;
	Employee(){
		eid=101;
		name="unknown";
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.eid);
		System.out.println(e.name);
		Employee e1=new Employee(); 
		System.out.println(e1.eid);
		System.out.println(e1.name);

	}

}

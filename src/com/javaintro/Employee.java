package com.javaintro;

public class Employee {
	double salary=20000;
	String name;
	static int id;
	double pf,da;
	double netsalary;
	{
		id+=1;
	}
	void method(String name,int id,double salary) {
		pf=salary*0.12;
		da=100*30;
		netsalary=salary+da-pf;
		System.out.println("********************");
		System.out.println(name);
		System.out.println(salary);
		System.out.println(pf);
		System.out.println(da);
		System.out.println(netsalary);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		id=101;
		e1.method("harini", id, e1.salary);
		Employee e2=new Employee();
		e2.method("malli", id, e2.salary);
		Employee e3=new Employee();
		e3.method("harini", id,e3.salary);
		
	
	}
}

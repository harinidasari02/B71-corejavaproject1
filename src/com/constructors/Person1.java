package com.constructors;

public class Person1 {
	String name;
	int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
class Employee extends Person1{
	int id;
	double salary;
	Employee(String name,int age,int id,double salary){
		super(name,age);
		this.id=id;
		this.salary=salary;
	}
	void display() {
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(age);
	}
}
	public static void main(String[] args) {
		Person1 p=new Person1("hari",10);
		Employee e=p.new Employee("harini",20,10,1000.0);
		e.display();
	}
}

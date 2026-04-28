package com.constructors;

public class Person {
	String name;
	int age;
	Person(){
		System.out.println("no details provided");
	}
	Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		Person p1=new Person("harini");
		p1.display();
		Person p2=new Person("malli", 20);
		p2.display();

	}

}

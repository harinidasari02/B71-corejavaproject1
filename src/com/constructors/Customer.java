package com.constructors;

public class Customer {
	int cid;
	String cname;
	int age;
	long phone;
	Customer(){
		System.out.println("no arg constructor called");
		cid=101;
		cname="unknown";
		age=0;
		phone=0;
	}

	public Customer(int cid, String cname, int age, long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
		this.phone = phone;
	}

	void show() {
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(age);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		Customer c=new Customer(07,"dhoni",42,777777777L);
		c.show();
		Customer c1=new Customer();
		c1.show();	
	}

}

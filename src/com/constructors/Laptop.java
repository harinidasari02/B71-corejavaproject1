package com.constructors;

public class Laptop {
	String brand;
	double ram;
	int price;
	Laptop(){
		ram=0.0;
		price=0;
		brand="unknown";
	}
	
	public Laptop(String brand, double ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	void display() {
		System.out.println("brand name is : "+brand);
		System.out.println("ram is: "+ram);
		System.out.println("price is: "+price);
	}
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.display();
		Laptop l1=new Laptop("harini", 2.6, 1000);
		l1.display();
	}

}

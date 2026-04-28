package com.constructors;

public class Mobile {
	String brand;
	String model;
	double price;
	Mobile(){
		brand="no details available";
		model="no details available";
		price=0;
	}
	public Mobile(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	void display() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("sonet", "kia", 15000.00);
		m.display();
		Mobile m1=new Mobile();
		m1.display();
	}
}

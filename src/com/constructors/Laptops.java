package com.constructors;

public class Laptops {
	String model;
	String brand;
	double price;
	String color;
	Laptops(){
		model="unknown";
		brand="unknown";
		price=0.0;
		color="unknown";
	}
	
	Laptops(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}

	Laptops(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	void display() {
		System.out.println("model:"+model);
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color: "+color);
	}
	public static void main(String[] args) {
		Laptops l=new Laptops();
		l.display();
		Laptops l1=new Laptops("harini","dasari");
		l1.display();
		Laptops l2=new Laptops("dell", "intel", 100000);
		l2.display();
	}

}

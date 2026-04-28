package com.constructors;

public class Lapt0p {
	String model;
	String brand;
	double price;
	String color;
	Lapt0p(){
		this("unknown","unknown");
		color="unknown";
		price=0;
	}
	
	Lapt0p(String model, String brand) {
		this(model,brand,0.0);
	}
	
	
	public Lapt0p(String model, String brand, double price) {
		this(model,brand,price,"unknown");
	}
	

	public Lapt0p(String model, String brand, double price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	void display() {
		System.out.println("model is: "+model);
		System.out.println("brand is : "+brand);
		System.out.println("color is: "+color);
		System.out.println("price is: "+price);
	}
	public static void main(String[] args) {
		Lapt0p l=new Lapt0p();
		l.display();
		Lapt0p l1=new Lapt0p("harini", "dasari");
		l1.display();
		Lapt0p l2=new Lapt0p("harini", "dasari", 10000.06);
		l2.display();
		Lapt0p l3=new Lapt0p("harini","dasari",1000.00,"red");
		l3.display();
	}

}

package com.practice;

public class Laptop {
	String brand;
	String model;
	double price;
	Laptop(){
		this("unknown");
	}
	Laptop(String brand){
		this(brand,"unknown");
		}
	Laptop(String brand,String model){
		this(brand,model,0);
	}
	Laptop(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;	
	}
	Laptop(Laptop l){
		this.brand=l.brand;
		this.model=l.model;
		this.price=l.price;
	}
	void show() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Laptop l = new Laptop("hp", "pavilion", 50000);
	    l.show();
	    Laptop l1=new Laptop(l);
	    l1.show();
	}

}

package com.practice;

public class Mobile {
	String brand;
	double price;
	Mobile(){
		this("unknown");
	}
	Mobile(String brand){
		this(brand,0);
	}
	Mobile(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	void show() {
		System.out.println(brand);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.show();
		Mobile m1=new Mobile("moto");
		m1.show();
		Mobile m2=new Mobile("moto",2500.05);
		m2.show();
	}

}

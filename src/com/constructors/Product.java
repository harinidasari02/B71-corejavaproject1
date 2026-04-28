package com.constructors;

public class Product {
	String name;
	double price;
	Product(){
		System.out.println("product called");
	}
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	public static void main(String[] args) {
		
	}

}
	class Mouse extends Product{
		Mouse(String name,double price){
			super(name,price);
			System.out.println("Mouse parameterized called");
		}
		void show() {
			System.out.println(name);
			System.out.println(price);
		}
		public static void main(String[] args) {
			Mouse m=new Mouse("mouse",2.05);
			m.show();
		}
	}

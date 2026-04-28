package com.practice;
class Vehicle{
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}
	
}
class Car extends Vehicle{
	double price;
	Car(double price,String brand){
		super(brand);
		this.price=price;
	}
	
}
public class ElectricCar extends Car{
	double battery;
	ElectricCar(double price,String brand,double battery){
		super(price,brand);
		this.battery=battery;
	}
	void show() {
		System.out.println("brand: "+brand);
		System.out.println("battery: "+battery);
		System.out.println("price: "+price);
	}
	public static void main(String[] args) {
		ElectricCar e=new ElectricCar(2000.0,"ev",25000);
		e.show();
	}

}

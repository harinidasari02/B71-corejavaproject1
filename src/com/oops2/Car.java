package com.oops2;

public class Car extends Vehicle {
	void musicSystem() {
		System.out.println("music system is working");
	}

	@Override
	void drive() {
		System.out.println("car is driving smoothly");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.musicSystem();
		c.drive();
	}

}

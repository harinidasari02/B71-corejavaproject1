package com.oops2;

public class SmartPhone extends Device {
	SmartPhone(String brand, double power) {
		super(brand, power);
	}

	void makesCall() {
		System.out.println("SmartPhone makes call");
	}

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("moto", 250.00);
		Laptop l1 = new Laptop("hp", 3000.00);
		s.showDetails();
		l1.showDetails();
		l1.openLid();
		s.makesCall();

	}

}

package com.oops2;

public class Laptop extends Device {

	Laptop(String brand, double power) {
		super(brand, power);
	}
	void openLid() {
		System.out.println("laptop openlid");
	}


}
package com.oops2;

public class Device {
	String brand;
	double power;

	Device(String brand, double power) {
		this.brand = brand;
		this.power = power;
	}
	void showDetails() {
		System.out.println(brand);
		System.out.println(power);
	}
}

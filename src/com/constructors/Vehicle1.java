package com.constructors;

public class Vehicle1 {
	Vehicle1(){
		System.out.println("vehicle1");
	}
	public static void main(String[] args) {
		System.out.println("vstart");
		System.out.println("vend");
	}
}
	class Car extends Vehicle1{
		Car(){
			System.out.println("car");
		}
		public static void main(String[] args) {
			System.out.println("bike 1 start");
			Car b=new Car();
			System.out.println("bike 1 end");
		}
	}

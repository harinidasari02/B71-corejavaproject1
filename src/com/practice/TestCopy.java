package com.practice;

class Tes {
	int id;
	String name;
	Aress city;

	Tes(int id, String name, Aress address) {
		this.id = id;
		this.name = name;
		this.city = address;
	}

	Tes(Tes t) {
		this.id = t.id;
		this.name = t.name;
		this.city = new Aress(t.city.city);
	}
}

class Aress {
	String city;

	Aress(String city) {
		this.city = city;
	}
}

public class TestCopy {

	public static void main(String[] args) {

		Aress a = new Aress("hyd");

		Tes t4 = new Tes(1, "harini", a);

		System.out.println(t4.id);
		System.out.println(t4.name);
		System.out.println(t4.city.city);

		Tes t3 = new Tes(t4);

		System.out.println(t3.id);
		System.out.println(t3.name);
		System.out.println(t3.city.city);

		t4.city.city = "hyderabad";

		System.out.println(t4.city.city);
		System.out.println(t3.city.city);
	}
}

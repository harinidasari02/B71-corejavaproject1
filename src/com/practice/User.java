package com.practice;
public class User {

	String name;
	int id;
	String subtype;

	User() {
		this(0,"unknown","Guest");
		System.out.println("You are a guest user");
	}

	User(int id, String name) {
		this(id, name, "Registered");
		System.out.println("You are a registered user");
	}

	User(int id, String name, String subtype) {
		this.id = id;
		this.name = name;
		this.subtype = subtype;
		System.out.println("You are a premium user");
	}

	void login() {
		System.out.println("id is: " + id);
		System.out.println("name is: " + name);
		System.out.println("subscription type is: " + subtype);
		System.out.println("**************");
	}

	public static void main(String[] args) {

		User u1 = new User();
		u1.login();

		User u2 = new User(102, "Sita");
		u2.login();

		User u3 = new User(103, "Lakshman", "premium");
		u3.login();
	}

}

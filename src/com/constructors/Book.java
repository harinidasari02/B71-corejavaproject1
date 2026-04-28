package com.constructors;

public class Book {
	String title;
	String author;
	int price;
	Book(){
		title="unknown";
		author="anonymous";
		price=0;
	}
	void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Book b=new Book();
		b.display();
	}

}

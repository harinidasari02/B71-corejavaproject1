package com.practice;

public class Book {
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;	
	}
	Book(Book b){
		this.title=b.title;
		this.author=b.author;
		this.price=b.price;	

	}
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Book b=new Book("hi","harini",200.0);
		b.show();
		Book b1=new Book(b);
		b1.show();
	}

}

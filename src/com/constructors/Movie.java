package com.constructors;

public class Movie {
	String director;
	String producer;
	String hero;
	String heroine;
	String name;
	double budget;
	Movie(String director,String producer){
		this.director=director;
		this.producer=producer;
	}
	Movie(Movie m,String hero,String heroine){
		this.producer=m.producer;
		this.director=m.director;
		this.hero=hero;
		this.heroine=heroine;
	}
	Movie(Movie m1,String name,double budget){
		this.producer=m1.producer;
		this.director=m1.director;
		this.hero=m1.hero;
		this.heroine=m1.heroine;
		this.name=name;
		this.budget=budget;
	}
	void show() {
		System.out.println("Director name: "+director);
		System.out.println("producer name: "+producer);
		System.out.println("hero name : "+hero);
		System.out.println("heroine name: "+heroine);
		System.out.println("movie name : "+name);
		System.out.println("budget : "+budget);
	}
	public static void main(String[] args) {
		Movie m=new Movie("rajamouli","karthikeya");
		Movie m1=new Movie(m,"mahesh","priyanka");
		Movie m2=new Movie(m1,"varanasi",50000.0);
		m2.show();
		
	}

}

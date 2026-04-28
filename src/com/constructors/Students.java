package com.constructors;

public class Students {
	int id;
	int age;
	String name;
	Students(){
		this(101);
		System.out.println("no arg called");
	}
	
	Students(int id) {
		this(id,"unknown");
		System.out.println("one arg called");
	}
	
	Students(int id, String name) {
		this(id,name,20);
		System.out.println("two arg called");
	}
	Students(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println(id);
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Students s=new Students(10,"harini");
		s.display();
		
	}

}

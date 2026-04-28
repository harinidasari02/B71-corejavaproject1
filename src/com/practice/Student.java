package com.practice;

public class Student {
	int age;
	int id;
	String name;
	Student(){
		this(10,01);
	}
	Student(int age,int id){
		this(age,id,"unknown");
	}
	Student(int age,int id,String name){
		this.age=age;
		this.id=id;
		this.name=name;
	}
	void show() {
		System.out.println(age);
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		Student s1=new Student(20,10);
		s1.show();
		Student s2=new Student(20,10,"harini");
		s2.show();
	}

}

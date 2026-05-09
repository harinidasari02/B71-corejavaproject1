package com.accessModifiers;

class TestDefault {

	int id=10;
	String name="harini";
	void display() {
		System.out.println("method called");
	}
	static {
		System.out.println("static block called");
	}
	{
		System.out.println("instance block called");
	}
	TestDefault(){
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		TestDefault t=new TestDefault();
		System.out.println(t.id);
	}

}

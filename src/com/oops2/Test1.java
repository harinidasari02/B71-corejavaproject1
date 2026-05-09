package com.oops2;

class Test2 {
	int x = 100;

	void method1() {
		System.out.println("method1");
	}
}

public class Test1 extends Test2 {
//	 void method1() {CE:Cannot reduce the visibility of the inherited method from Test2
	// TODO Auto-generated method stub
//		super.method1();
//	}
	void method1() {
		System.out.println("method2");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.method1();
		System.out.println(t.x);
	}

}

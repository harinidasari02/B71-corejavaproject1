//single Inheritance
package com.oops2;

//
//class Test {
//	void method() {
//		System.out.println("Test called");
//	}
//}
//
//public class TestA extends Test {
// 
//	public static void main(String[] args) {
//		TestA a=new TestA();
//		a.method();
//	}
//
//}
//multi level inheritance
//class TestA{
//	void method() {
//		System.out.println("1 called");
//	}
//}
//class TestB extends TestA{
//	void method1() {
//		System.out.println("2 called");
//	}
//}
//class TestC extends TestB{
//	
//	void method2() {
//		System.out.println("3 called");
//	}
//	public static void main(String[] args) {
//		TestC c=new TestC();
//		c.method();
//		c.method1();
//		c.method2();
//	}
//	
//}
//hierarchical inheritance
class TestA {
	void method() {
		System.out.println("1 called");
	}
}

class TestB extends TestA {
	void method1() {
		System.out.println("2 called");
	}

	public static void main(String[] args) {
		TestB b = new TestB();
		b.method();
		b.method1();
	}
}

class TestC extends TestA {

	void method2() {
		System.out.println("3 called");
	}

	public static void main(String[] args) {
		TestC c = new TestC();
		c.method();
		c.method2();
	}

}

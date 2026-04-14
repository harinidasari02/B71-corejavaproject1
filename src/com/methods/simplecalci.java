package com.methods;

public class simplecalci {
	static void method() {
		System.out.println(10 + 20);
	}

	static void method1() {
		System.out.println(10 - 20);
	}

	static void method2() {
		System.out.println(10 * 20);
	}

	static void method3() {
		System.out.println(10 / 20);
	}

	static void method4() {
		System.out.println(10 % 20);
	}
	void method5() {
		System.out.println(200+400);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		simplecalci s=new simplecalci();
		method();
		method1();
		method2();
		method3();
		method4();
		s.method5();
		System.out.println("main method ended");

	}

}

package com.methodOverriding;

public class ReturnType1 extends ReturnType {

	String getRoI() {
		String b = "Harini";
		return b;
	}

	Number getRoI2() {
		int b = 11;
		return b;
	}

	Number getRoI3() {
		long b = 11L;
		return b;
	}

	Number getRoI4() {
		float b = 11.4f;
		return b;
	}

	Number getRoI5() {
		double b = 11.2;
		return b;
	}

	public static void main(String[] args) {
		ReturnType r = new ReturnType1();
		System.out.println(r.getRoI());
	}

}

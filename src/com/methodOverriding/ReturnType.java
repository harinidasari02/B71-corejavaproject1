package com.methodOverriding;

public class ReturnType {
	Object getRoI() {
		String b = "10";
		return b;
	}

	Number getRoI1() {
		short b = 10;
		return b;
	}

	Number getRoI2() {
		int b = 10;
		return b;
	}

	Number getRoI3() {
		long b = 10L;
		return b;
	}

	Number getRoI4() {
		float b = 10.4f;
		return b;
	}

	Number getRoI5() {
		double b = 10.2;
		return b;
	}
}

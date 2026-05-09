package com.loops;

public class Test {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int count=0;
		for (i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}

}

package com.loops;

public class Test1 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int count=0;
		for (i = 10; i < 20; i++) {
			sum = sum + i;
			count++;
//			System.out.println("number is:" +sum);
			
		}
		System.out.println(sum);
		System.out.println(count);
	}

}

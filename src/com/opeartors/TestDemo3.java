package com.opeartors;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
			System.out.println("Alphabet");
		} else if (s >= 0 && s <= 9) {
			System.out.println("number");
		} else {
			System.out.println("special character");
		}
		sc.close();
	}
}

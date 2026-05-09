package com.logicalStatements;

import java.util.Scanner;

public class TestLs4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String obj=sc.next();
		switch(obj) {
		case String s when s.length()>5 ->System.out.println("object");
		default  -> System.out.println("unknown");
		}
		sc.close();
	}

}

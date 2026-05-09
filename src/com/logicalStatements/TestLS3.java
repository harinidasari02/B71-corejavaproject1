package com.logicalStatements;

import java.util.Scanner;

public class TestLS3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Menu========");
		System.out.println("1.Pizza");
		System.out.println("2.Burgger");
		System.out.println("3.drinks");
		System.out.println("Enter the category");
		String catg = sc.next().toLowerCase();
		switch (catg) {
		case "1" -> {
			System.out.println("enter the item");
			System.out.println("i.chicken pizza");
			System.out.println("ii.veg pizza");
			String item = sc.next();
			switch (item) {
			case "i" -> System.out.println("chicken pizza 1pc-100rupees");
			case "ii" -> System.out.println("veg pizza 1pc -50 rupees");
			}
		}
		case "2" -> {
			System.out.println("enter the item");
			System.out.println("i.cheese");
			System.out.println("ii.veg");
			String item = sc.next();
			switch (item) {
			case "i" -> System.out.println("cheese burger 1pc-100rupees");
			case "ii" -> System.out.println("veg burger 1pc -50 rupees");
			}
		}
		case "3" -> {
			System.out.println("enter the item");
			System.out.println("i.coke");
			System.out.println("ii.juice");
			String item = sc.next();
			switch (item) {
			case "i" -> System.out.println("coke 100rupees");
			case "ii" -> System.out.println("juice 50 rupees");
			}
		}
		}
		sc.close();
	}
}

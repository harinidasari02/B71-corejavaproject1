package com.practice;
import java.util.Scanner;
public class MethodPractice7 {
	static Scanner sc=new Scanner(System.in);
	static String getName() {
		String name=sc.next();
		return name;
	}
	static long getPhoneNo() {
		long phoneNo=sc.nextLong();
		return phoneNo;
	}
	public static void main(String[] args) {
		System.out.println("name: "+getName());
		System.out.println("phoneNo:"+getPhoneNo());
	}

}

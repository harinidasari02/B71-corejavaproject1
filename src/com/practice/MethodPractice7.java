package com.practice;
import java.util.Scanner;
public class MethodPractice7 {
	static Scanner sc=new Scanner(System.in);
	static String getName() {
		String name=sc.nextLine();
		return name;
	}
	static long getPhoneNo() {
		long phoneNo=sc.nextLong();
		return phoneNo;
	}
	static String fatherName() {
		sc.nextLine();
		String fatherName=sc.nextLine();
		return fatherName;
	}
	public static void main(String[] args) {
		System.out.println("name: "+getName());
		System.out.println("phoneNo:"+getPhoneNo());
		System.out.println("fatherName:"+fatherName());
	}

}

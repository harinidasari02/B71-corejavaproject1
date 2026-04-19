package com.practice;
import java.util.Scanner;
public class CaseStudy1 {
	static double total=500;
	static Scanner sc=new Scanner(System.in);
	static double subMarks(int m,int sci,int e,int soc,int tel) {
		int totalMarks=m+sci+e+soc+tel;
		double percent=(totalMarks/total)*100;
		return percent;
	}
	public static void main(String[] args) {
		System.out.println("enter maths marks: ");
		int m=sc.nextInt();
		System.out.println("enter science marks: ");
		int sci=sc.nextInt();
		System.out.println("enter english marks: ");
		int e=sc.nextInt();
		System.out.println("enter social marks: ");
		int soc=sc.nextInt();
		System.out.println("enter telugu marks: ");
		int tel=sc.nextInt();
		double res=subMarks(m, sci, e, soc, tel);
		System.out.println("percent is: "+res);
		sc.close();
	}

}

package com.practice;
import java.util.Scanner;
public class MethodPractice6 {
	static double areaOfTriangle(double base,double height) {
		double area=0.5*base*height;
		return area;
	}
	static double areaOfRectangle(double width,double length) {
		double area=length*width;
		return area;
	}
	static double areaOfSquare(double side) {
		double area=side*side;
		return area;
	}
	static double areaOfCircle(double radius) {
		double area=Math.PI*radius*radius;
		return area;
	}
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("triangle");
		System.out.println("enter the base value: ");
		double base=sc.nextDouble();
		System.out.println("enter the height value: ");
		double height=sc.nextDouble();
		double triangleArea=areaOfTriangle(base,height);
		System.out.println("area of triangle is: "+triangleArea);
		System.out.println("rectangle");
		System.out.println("enter the length");
		double length=sc.nextDouble();
		System.out.println("enter the width");
		double width=sc.nextDouble();
		double rectangleArea=areaOfRectangle(width,length);
		System.out.println("area of rectangle is: "+rectangleArea);
		System.out.println("square area");
		System.out.println("enter side value: ");
		double side=sc.nextDouble();
		double squareArea=areaOfSquare(side);
		System.out.println("area of square is "+squareArea);
		System.out.println("circle area");
		System.out.println("enter r value:");
		double r=sc.nextDouble();
		double circleArea=areaOfCircle(r);
		System.out.printf("area of circle is: %.5f\n",circleArea);
		sc.close();
		
		
	}

}

package com.javaintro;

public class Test {
	static int count=0;
	Test(){
		count+=1;
	}

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		Test t5=new Test();
		Test t6=new Test();
		System.out.println(Test.count);
	}
}

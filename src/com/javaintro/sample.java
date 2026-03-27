package com.javaintro;

public class sample {
	int jerseyNumber;
	String cricketerName;
	
	static String bankName;
	static int rollNo;
	public static void main(String[] args) {
		bankName="HDFC";
		rollNo=37;
		
		sample c1=new sample();
		c1.jerseyNumber=07;
		c1.cricketerName="MSD";
		
		
		System.out.println(bankName);
		System.out.println(rollNo);
		System.out.println(c1.jerseyNumber);
		System.out.println(c1.cricketerName);

	}

}

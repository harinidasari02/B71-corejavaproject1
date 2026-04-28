package com.constructors;

public class College {
	String cName;
	String deptName;
	int rollNo;
	String stdName;
	long regNo;
	 College() {
		this("unknown","unknown",0);
		stdName="harini";
		regNo=22711040l;
	}
	 College(String cName, String deptName, int rollNo) {
		this(cName,deptName,rollNo,"unknown");
	}
	public College(String cName, String deptName, int rollNo, String stdName) {
	this(cName,deptName,rollNo,stdName,0);
}
	public College(String cName, String deptName, int rollNo, String stdName, long regNo) {
		super();
		this.cName = cName;
		this.deptName = deptName;
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.regNo = regNo;
	}
	
	void display() {
		System.out.println(cName);
		System.out.println(deptName);
		System.out.println(rollNo);
		System.out.println(stdName);
		System.out.println(regNo);
	}
	public static void main(String[] args) {
		College c=new College();
		c.display();
		College c1=new College("narayana","ece",20);
		c1.display();
		College c2=new College("nar","cse",22,"harini");
		c2.display();
		College c3=new College("nar","eee",25,"harini",22711);
		c3.display();
	}

}

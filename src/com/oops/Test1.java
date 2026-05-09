package com.oops;
class Employee implements Cloneable{
	int eid;
	String name;
	Address address;
	Employee(int eid,String name,Address address){
		this.eid=eid;
		this.name=name;
		this.address=address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Address{
	String city;
	Address(String city){
		this.city=city;
	}
}
public class Test1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a=new Address("hyderabad");
		Employee e=new Employee(10,"harini",a);
		Employee e1=(Employee) e.clone();
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.address.city);
		System.out.println(e1.eid);
		System.out.println(e1.name);
		System.out.println(e1.address.city);
	}

}

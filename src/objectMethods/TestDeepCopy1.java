package objectMethods;

class Employees1 implements Cloneable {
	int age;
	String name;
	Address1 address;

	Employees1(int age, String name, Address1 address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	Employees1(Employees1 emp) {
		this.age = emp.age;
		this.name = emp.name;
		this.address = new Address1(emp.address);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class Address1 {
	String city;

	Address1(String city) {
		this.city = city;
	}

	Address1(Address1 a1) {
		this.city = a1.city;
	}
}

public class TestDeepCopy1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address1 a = new Address1("hyd");
		Employees1 e = new Employees1(21, "harini", a);
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(e.address.city);
		Employees1 e1 = (Employees1)e.clone();
		System.out.println(e1.age);
		System.out.println(e1.name);
		System.out.println(e1.address.city);
		e.address.city = "nellore";
		e1.address.city = "hyderabad";
		System.out.println(e.address.city);
		System.out.println(e1.address.city);
		e.name = "thanuja";
		e1.name = "nagamalleswari";
		System.out.println(e.name);
		System.out.println(e1.name);
	}
}

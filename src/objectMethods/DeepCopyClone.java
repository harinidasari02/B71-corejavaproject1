package objectMethods;

class Student10 implements Cloneable {
	int age;
	String name;
	Address10 city;

	public Student10(int age, String name, Address10 city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student10 s1 = (Student10) super.clone();
		s1.city=(Address10) city.clone();
		return s1;
	}
}

class Address10 implements Cloneable {
	String city;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Address10(String city) {
		super();
		this.city = city;
	}

}

public class DeepCopyClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address10 a = new Address10("hyd");
		Student10 s = new Student10(22, "harini", a);
		Student10 s1 = (Student10) s.clone();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.city.city);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.city.city);
		s.city.city = "nellore";
		System.out.println(s.city.city);
		System.out.println(s1.city.city);
	}

}

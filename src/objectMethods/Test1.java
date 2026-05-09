package objectMethods;
class Student implements Cloneable{
	int id;
	String name;
	Address address;
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	Student(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
}
class Address{
	String city;
	String district;
	Address(String city,String district){
		this.city=city;
		this.district=district;
	}
}
public class Test1 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address a=new Address("pedana","krishna");
		Student s=new Student(10,"harini",a);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.address.city);
		System.out.println(s.address.district);
		Student s1=(Student) s.clone();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println(s1.address.district);
		s1.address.city="gudur";
		System.out.println(s.address.city);
		System.out.println(s1.address.city);
	}
}

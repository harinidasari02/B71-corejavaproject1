package objectMethods;
class Employee{
	int eid;
	String name;
	Add add1;
	public Employee(int eid, String name,Add add1) {
		super();
		this.eid = eid;
		this.name = name;
		this.add1=add1;
	}
	Employee(Employee emp){
		this.eid=emp.eid;
		this.name=emp.name;
		this.add1=new Add(emp.add1);
	}
}
class Add{
	String city;

	public Add(String city) {
		super();
		this.city = city;
	}
	Add(Add a){
		this.city=a.city;
	}
}
public class Test2 {

	public static void main(String[] args) {
		Add a=new Add("nellore");
		Employee e=new Employee(10,"harini",a);
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.add1.city);
		Employee e1=new Employee(e);
		System.out.println(e1.eid);
		System.out.println(e1.name);
		System.out.println(e1.add1.city);
		e.eid=100;
		System.out.println(e.eid);
		System.out.println(e1.eid);
		e.add1.city="hyd";
		System.out.println(e.add1.city);
		System.out.println(e1.add1.city);

	}

}

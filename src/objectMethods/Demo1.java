package objectMethods;

class Employeed implements Cloneable {
	int eid;
	String name;
	Added add1;

	public Employeed(int eid, String name, Added add1) {
		this.eid = eid;
		this.name = name;
		this.add1 = add1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		// shallow copy
		Employeed cloned = (Employeed) super.clone();

		// deep copy for reference object
		cloned.add1 = (Added) add1.clone();

		return cloned;
	}
}

class Added implements Cloneable {
	String city;

	public Added(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Demo1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Added a = new Added("nellore");

		Employeed e = new Employeed(10, "harini", a);

		Employeed e1 = (Employeed) e.clone();

		e.add1.city = "hyd";

		System.out.println(e.add1.city); // hyd
		System.out.println(e1.add1.city); // nellore
	}
}

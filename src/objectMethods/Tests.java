package objectMethods;

class Emloyee implements Cloneable {
	int id;
	String name;
	District district;

	Emloyee(int id, String name, District district) {
		this.id = id;
		this.name = name;
		this.district = district;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class District {
	String village;

	District(String village) {
		this.village = village;
	}
}

public class Tests {

	public static void main(String[] args) throws CloneNotSupportedException {
		District d = new District("atmakur");
		Emloyee e = new Emloyee(1, "harini", d);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.district.village);
		Emloyee e1 = (Emloyee) e.clone();
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.district.village);
		e.id = 02;
		System.out.println(e.id);
		System.out.println(e1.id);
		e.district.village = "nlr";
		System.out.println(e.district.village);
		System.out.println(e1.district.village);
	}

}

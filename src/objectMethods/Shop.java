package objectMethods;

class Worker {
	int age;
	String name;
	Adds c;

	public Worker(int age, String name, Adds c) {
		super();
		this.age = age;
		this.name = name;
		this.c = c;
	}

	Worker(Worker w) {
		this.age = w.age;
		this.name = w.name;
		this.c = new Adds(w.c);
	}
}

class Adds {
	String city;

	public Adds(String city) {
		super();
		this.city = city;
	}

	Adds(Adds s) {
		this.city = s.city;
	}
}

public class Shop {

	public static void main(String[] args) {
		Adds s = new Adds("hyd");
		Worker w = new Worker(21, "harini", s);
		Worker w1 = new Worker(w);
		System.out.println(w.age);
		System.out.println(w.name);
		System.out.println(w.c.city);
		System.out.println(w1.age);
		System.out.println(w1.name);
		System.out.println(w1.c.city);
		w.c.city="nellore";
		System.out.println(w.c.city);
		System.out.println(w1.c.city);
	}

}

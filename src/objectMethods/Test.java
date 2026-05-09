package objectMethods;

class Car {
	int no;
	String name;
	Color color;

	Car(int no, String name, Color color) {
		this.color = color;
		this.name = name;
		this.no = no;
	}

	public Car(Car c1) {
		this.color = new Color(c1.name);
		this.name = c1.name;
		this.no = c1.no;
	}
}

class Color {
	String car;

	public Color(String car) {
		this.car = car;
	}
}

public class Test {

	public static void main(String[] args) {
		Color c = new Color("red");
		Car c1 = new Car(1, "kia", c);
		System.out.println(c1.name);
		System.out.println(c1.no);
		System.out.println(c1.color.car);
		Car c2 = new Car(c1);
		System.out.println(c2.name);
		System.out.println(c2.no);
		System.out.println(c2.color.car);
		c2.color.car = "yellow";
		System.out.println(c1.color.car);
		System.out.println(c2.color.car);
	}

}

package objectMethods;

public class PracticeMethods {
	int a;
	String name;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called!!");
	}

	@Override
	public String toString() {
		return "PracticeMethods [a=" + a + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		PracticeMethods p = new PracticeMethods();
		PracticeMethods p1 = new PracticeMethods();
		System.out.println("checks the address of the object : " + p1.equals(p));
		System.out.println("coverts the address decimal into int: " + p.hashCode());
		System.out.println("coverts the address decimal into int :" + p1.hashCode());
		p1 = p;
		System.gc();
		System.out.println("get the fully qualified name of the class: " + p.getClass());
		System.out.println(p.toString());
	}

}

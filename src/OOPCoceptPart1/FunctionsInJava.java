package OOPCoceptPart1;

public class FunctionsInJava {

	// main method is void and does'nt return any value

	public static void main(String[] args) {

		// After creating the object, copy of all the non static methods will be given
		// to this object obj.
		// To access all the non static methods, we need to create object
		FunctionsInJava obj = new FunctionsInJava();

		obj.test();

		int i = obj.pqr();
		System.out.println(i);

		String s1 = obj.qa();
		System.out.println(s1);

		int div = obj.division(50, 10);
		System.out.println(div);

	}

	// non static methods

	public void test() {
		System.out.println("test method");

	}

	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";

		return s;

	}

	public int division(int x, int y) {

		System.out.println("division method");
		int d = x / y;
		return d;

	}

}

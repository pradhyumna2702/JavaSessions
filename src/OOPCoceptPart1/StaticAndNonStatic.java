package OOPCoceptPart1;

public class StaticAndNonStatic {

	// scope of global variable will be available across all the functions with some
	// conditions.

	String name = "tom"; // non static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {

		// how to call static methods and variables
		// static methods and variable(age and sum())are freely available in java
		// memory hence no need to access them using objects.
		

		// 1. direct calling
		sum();
		System.out.println(age);

		// 2. calling by class name
		StaticAndNonStatic.sum();	
		System.out.println(StaticAndNonStatic.age);

		// how to call non static methods and variables->by creating object of the class

		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.sendMail();

		// can we access static variables/methods using objects--> Yes, but not
		// advisable as it throws warning msg

		obj.sum();// warning msg: The static method sum() from the type StaticAndNonStatic should
					// be accessed in a static way

	}

	// non static method
	public void sendMail() {
		System.out.println("sendmail method");

	}

	// static method
	public static void sum() {
		System.out.println("sum method");
	}

}

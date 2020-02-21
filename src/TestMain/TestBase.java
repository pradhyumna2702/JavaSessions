package TestMain;

public class TestBase {

	
	//JVM will search for below main  method  with String[] args
	//We can over load main method but always jvm looks for below method only.
	public static void main(String[] args) {

		System.out.println("Main Method-1");
		
		//to call other main methods we have to call separately in main method
		main(10);
		main(10,20);
		main("hello");
	}
	
	
	public static void main(int a) {

		System.out.println("Main Method-2");
	}

	public static void main(int a,int b) {

		System.out.println("Main Method-3");
	}
	
	public static void main(String args) {

		System.out.println("Main Method-4");
	}
}

package TestPackage;

public class FinallyConcept {

	public static void main(String[] args) {
		
		division();
		
	}
	
	public static void division() {
		
		int i=10;
		try {
			System.out.println("Try method");
			int k=i/0;	
		}
		//catch(NullPointerException e) {
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("number entered cannot be divided by 0");
		}
		//Finally is a block
		finally {
			System.out.println("Continue with execution even after exeception is caught ");
		}
		
	}

}

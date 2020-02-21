package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		if(b>a) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("a is greatest");
		}

		//To find the greatest of 3 numbers
		
		int x=10;
		int y=9;
		int z=8;
		
		if(x>y & x>z) {
			System.out.println("x is greatest");
		}
		else if(y>z) {
			System.out.println("y is greatest");
		}
		else {
			System.out.println("z is greatest");
		}
	}

}

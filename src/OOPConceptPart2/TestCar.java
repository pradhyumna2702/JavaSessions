package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		// whenever method is common in child class as well as in parent class,
		// preference will be given to child class

		/*
		 * when same method is present in both child class as well as in parent class
		 * with same name and same arguements is called method overriding
		 */
		/*
		 * same method name with different input parameters with different datatypes in
		 * same class is called method overloading
		 */

		// Static Polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.antitheft();
	/*	b.stop();
		b.refuel();
		b.engine();*/

		System.out.println("********");

		Car c = new Car();
		c.start();
		/*c.stop();
		c.refuel();
		c.engine();
*/		

		System.out.println("********");
		
		//Child class object can be referred by paent class reference variable is called dynamic or runtime polymorphism.
		//Prefer3ence wil be given to overridden method
		//only over ridden methods and parent class methods can be called using dynamic polymorphism.(We cannot access anitheft method).
		
		//TopCasting
		Car c1 = new BMW();
		c1.start();
/*		c1.stop();
		c1.refuel();*/
		
		
		// BMW b1=new Car(); - Downcasting is not allowed 
		BMW b1=(BMW)new Car();//Exception in thread "main" java.lang.ClassCastException: cannot be cast to OOPConceptPart2.BMW
		
		System.out.println("********");
		
		
		
		

	}

}

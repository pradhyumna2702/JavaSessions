package OOPCoceptPart1;

public class Car {

	// class variables(global variables):

	String model;
	int wheel;

	public static void main(String[] args) {
		
		//new car() is object of car class and 'a' is reference variable referring object.
		//a,b,c are object reference variables.
		//new keyword is used to create the object.
		//Main method can be overloaded
		//same method name  with different input parameters with different datatypes is called method overloading 
		
		Car a = new Car(); 
		Car b = new Car();
		Car c = new Car();

		
		a.model="BMW";
		a.wheel=4;
		
		
		b.model="benz";
		b.wheel=4;
		
		
		c.model="ferrari";
		c.wheel=4;
		
		
		System.out.println("Before shifting the references");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		
		System.out.println("After shifting the references");
		
		
		a=b;
		b=c;
		c=a;
		
		
		a.wheel=10;		
		System.out.println(a.wheel);
		System.out.println(b.wheel);
		c.wheel=20;
		System.out.println(a.wheel);
		System.out.println(b.wheel);
		System.out.println(c.wheel);
	}

}

package OOPConceptPart3;

public abstract class Shape {
	
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Fill method");
		
	}
	
	//cannot create object of abstract class
	//Abstract class can have method declarion as well as defined methods as well.
	//Abstact class should have atleast 1 abstract method(non implemented method)

}

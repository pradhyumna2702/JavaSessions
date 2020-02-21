package OOPConceptPart4;

public class ConstructorConcept {

	// Class variables
	String name;
	int age;

	// We can over load Constructors
	//Constructors are mainly used to initialize class variables
	
	public ConstructorConcept() {// 0 parameter

		System.out.println("Default constructor");

	}

	public ConstructorConcept(int i) {// 1 parameter

		System.out.println("1 parameter constructor");
		System.out.println(i);
	}
	public ConstructorConcept(int i,int j) {// 2 parameter

		System.out.println("2 parameter constructor");
		System.out.println(i+" "+j);

	}
	public ConstructorConcept(String name,int age){
		this.age=age;
		this.name=name; //this.classvar=localvar(this keyword is used when we have to initialize class var with local var
		
		

	}
	public static void main(String[] args) {
		
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(5);
		ConstructorConcept obj2 = new ConstructorConcept(5,10);
		ConstructorConcept obj3 = new ConstructorConcept("Tom",25);
		
		System.out.println(obj3.age);
		System.out.println(obj3.name);
	}

}

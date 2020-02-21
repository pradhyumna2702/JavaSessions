package AbstractionConcept;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	static int loanrate=5;
	
	//abstraction--> Hiding implementation logic and is implemented in child class\
	//Abstract class can have abst as well as non abst methods
	//Cannot create object of abstract class and interface
	//We can create static,nonstatic and final variables in abstract class
	//Performance wise abstract class are faster than interfaces
	
	public abstract void loan();// abstract method -- has no method body

	public void credit() {
		System.out.println("Credit method");
	}
	
	public void debit() {
		System.out.println("debit method");
	}
}

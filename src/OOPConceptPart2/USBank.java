package OOPConceptPart2;

public interface USBank {

	//Interface: 
	/*has only method declaration(method body)
	 * Only provides the features/policies without business logic
	 * we can declare the variables and value of variable will not be changed(static in nature and are final)
	 * no static methods in interface(only non static in nature)
	 * no main method
	 * we cannot create object of interface which means interface are abstract in nature 
	 * Interface is 100% abstraction (Only method declaraion and no business logic written
	 * Abstract method  is nothing but only method declation and no implementation
	 */
	
	int min_bal=1000;
	
	public void credit();
	public void debit();
	public void transferMoney();
	
}

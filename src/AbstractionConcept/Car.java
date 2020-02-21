package AbstractionConcept;

public interface Car {
	
	int wheel=4;
	
	//Interface- We only define abstract methods
	//no method body
	// only method declaration
	//We achieve 100 % abstraction
	//Only final and static variables can be defined in interface
	
	public void start();
	public void stop();
	public void refuel();

}

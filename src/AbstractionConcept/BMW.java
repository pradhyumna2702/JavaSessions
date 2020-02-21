package AbstractionConcept;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("start method");
	}

	@Override
	public void stop() {
		System.out.println("stop method");
	}

	@Override
	public void refuel() {
		System.out.println("refuel method");
	}
	
	
	//non-overriden methods
	public void threftSafety() {
		System.out.println("threftSafety method");
	}
	

}

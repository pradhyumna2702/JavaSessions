package AbstractionConcept;

public class TeatCar {

	public static void main(String[] args) {

		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threftSafety();
		
		
		Car c=new BMW();
		c.start();
		c.start();
		c.refuel();
	
		
	}

}

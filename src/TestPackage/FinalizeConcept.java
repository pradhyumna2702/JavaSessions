package TestPackage;

public class FinalizeConcept {
	
	
	//used for clean up of object when object has no reference(Garbage collector.Its a Method
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {

		
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		//To call garbage collector
		System.gc();
	}
	
	
}

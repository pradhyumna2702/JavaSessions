package ExceptionsInJava;

public class ThrowKeyword {

	public static void main(String[] args) {

		
		//Throw keyword is used when we have to throw the exception deliberately
		
		
		System.out.println("ABC");

		try {
			throw new Exception("Own Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String exec_flag=" ";
		if(exec_flag.equals(" ")) {
			try {
				throw new  Exception("No Entry in cell  exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}

}

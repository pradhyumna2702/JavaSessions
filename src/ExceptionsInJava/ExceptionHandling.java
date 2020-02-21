package ExceptionsInJava;


//Object class is the super class of all other classes in java
//Hierarchy->  Error and Exception class extends Throwable class and this inturn extends Object class


public class ExceptionHandling {

	int a=10;
	
	public static void main(String[] args) {
		
//		Uncaught Exception
//		int i=10/0;
//		System.out.println(i);
		
		//Caught Exception
		//Thread.sleep(2000);
		
		//java.lang.NullPointerException
//		ExceptionHandling obj=new ExceptionHandling();
//		obj=null;
//		System.out.println(obj.a);
		
		//1. Exception handling using - Try-catch Block
		int i=10;
		try {
			System.out.println("Try method");
			int k=i/0;	//This code will throw an exception
		}
		//catch(NullPointerException e) {
		//catch(Exception e) {//No need to remember all the exceptions 
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			//To write user understandable message		
//			System.out.println("number entered cannot be divided by 0");
		}
		//Finally is a block
//		finally {
//			System.out.println("Continue with execution even after exception is caught ");
//		}
//		
		
		
		
		
	}

}

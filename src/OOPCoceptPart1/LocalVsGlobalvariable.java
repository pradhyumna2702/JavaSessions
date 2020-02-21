package OOPCoceptPart1;

public class LocalVsGlobalvariable {

	//Global variable/class variables
	//scope of global variable will be throughout the program
	//all non static variables and methods can only be accessed by creating object
	
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		
		int i=5; //local variable of main method
		System.out.println(i);
		
		LocalVsGlobalvariable obj=new LocalVsGlobalvariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.sum());

	}
	
	public int sum() {
		int i =10; //local variable  of sum method
		int j=20;
		int age=25;
		int div=j/i;
		return div;
		
	}

}

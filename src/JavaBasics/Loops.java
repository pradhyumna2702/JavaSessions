package JavaBasics;

public class Loops {

	public static void main(String[] args) {

		//1. While Loop
		//disadvantage: it will generate infinite loop if you dont give increment/decrement part.
		
		int i=1;//initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i++;//incremental/decremental
		}
			
		System.out.println("*******************");
		
		
		//2. For Loop (print 1 to 10)
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
	
		System.out.println("*******************");
		
		
		//(print 10 to 1)
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
		System.out.println("*******************");
		
		
		
	}

}

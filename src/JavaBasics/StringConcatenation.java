package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {

		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		double c=12.5;
		double d=2.5;
		//print : used to just print on console
		//println : used to print on console with new line
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+x+b+y);
		System.out.println(c+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d);
		System.out.println("The value of a is:"+a);
		System.out.println("sum of a and b is:"+(a+b));
		System.out.print(x);
		System.out.println(y);
	}

}

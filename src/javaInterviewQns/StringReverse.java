package javaInterviewQns;

public class StringReverse {
	
	 

	public static void main(String[] args) {

		String name = "Pradhyumna";

		String rev = " ";

		int len = name.length();
		System.out.println(len);

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		System.out.println(rev);

	
	StringBuffer bf=new StringBuffer(name);
	System.out.println(bf.reverse());
	
	
	
	}	

}

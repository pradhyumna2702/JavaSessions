package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		
		String s[][]=new String[3][5];
		System.out.println(s.length);//total no.of rows
		System.out.println(s[0].length);//total no.of columns
		
		//1st row
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		//2nd row
		s[1][0]="F";
		s[1][1]="G";
		s[1][2]="H";
		s[1][3]="I";
		s[1][4]="J";
		
		//3rd row
		s[2][0]="K";
		s[2][1]="L";
		s[2][2]="M";
		s[2][3]="N";
		s[2][4]="o";
		
	
		System.out.println(s[1][2]);
		System.out.println(s[2][2]);
		System.out.println(s[1][4]);
		
		
		//print all the values of 2d array: use foe loop
		
		
		for(int row=0;row<s.length;row++) {
			
			//row=0, col= 0 to 4
			//row=1, col= 0 to 4
			//row=2, col= 0 to 4
			
			for(int col=0;col<s[0].length;col++) {// inner for loop 
				System.out.println(s[row][col]);
			}
			
		}
		
		
		
		
		
	}

}

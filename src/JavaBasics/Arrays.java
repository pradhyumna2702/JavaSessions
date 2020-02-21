package JavaBasics;

public class Arrays {

	public static void main(String[] args) {

		// Array: is set of elements that stores similar datatypes in an array variable
		// and size is fixed.
		// to overcome this disadvantage of storing only similar data types : we use
		// object array.
		// to overcome this disadvantage of fixed size : we use collections
		// concept(list,set,map).
		//arrays are static where size is fixed.
		int i[] = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		System.out.println(i[2]);

		// to print the whole array we use loops

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);
		}

		double d[] = new double[2];
		d[0] = 1.2;
		d[1] = 22.3;
		System.out.println(d[1]);

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[1]);

		char c[] = new char[2];
		c[0] = 'a';
		c[1] = 'b';
		System.out.println(c[0]);

		String s[] = new String[3];
		s[0] = "chubbi";
		s[1] = "var";
		s[2] = "ran";
		System.out.println(s[0]);

		// object array
		Object ob[] = new Object[4];
		ob[0] = 'a';
		ob[1] = "tom";
		ob[2] = 2;
		ob[3] = true;
		System.out.println(ob[2]);
		System.out.println(ob[5]); // this will throw Arrayindexoutofboundsexception

	}

}
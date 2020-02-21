package collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		// It is similar to hashmap but it is synchronized
		// Its stored on the basis of key & value.
		// Key --> Object-->Hashcode(32 bit unique number decided by JVM) --->value will
		// be stored
		// If 2 objects are same the the will have same hashcode number
		// its always Synchronized and thread safe--> Only one thread can access object
		// at a time.
		//It contains only unique values (duplicate elements not allowed)
		//No null key and null values, but in hashmap its allowed

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "prad");
		h1.put(2, "var");
		h1.put(3, "ran");
		//h1.put(null, null);// not allowed

		// Create a clone or copy/shallow copy
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();

		h2 = (Hashtable<Integer, String>) h1.clone();
		System.out.println("values of h1" + h1);
		System.out.println("values of h2" + h2);

		h1.clear();
		System.out.println("values of h1" + h1);
		System.out.println("values of h2" + h2);

		// contains value
		Hashtable<String, String> st = new Hashtable<String, String>();
		st.put("A", "Prad");
		st.put("B", "var");
		st.put("C", "gee");

		if (st.contains("prad")) {
			System.err.println("value is found");
		} else {
			System.out.println("value not found");
			
		}
		
		//To get value from specific key
		System.out.println(st.get("B"));
		
		//How to print / iterate all values--Enumeration
		Enumeration e=st.elements();
		System.out.println("Print values using enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Get all the values from hastableusing entryset--set of hashtable values
		System.out.println("Print values using entryset");
		
		Set s=st.entrySet();
		System.out.println(s);
		
		Hashtable<Integer, String> st1 = new Hashtable<Integer, String>();
		st1.put(1, "prad");
		st1.put(2, "var");
		st1.put(3, "ran");

		//to check both hashtables are equals
		if(h2.equals(st1)) {
			System.out.println("both are equal");
		}
		
		//To get the hashcode of the hashtable object
		System.out.println("hashcode value of st1 is "+st1.hashCode());
		
		
		
		
	}

}

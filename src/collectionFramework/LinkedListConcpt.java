package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcpt {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("QTP");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");

		System.out.println("Content of linked list is : " + ll);

		// Add first
		ll.addFirst("Prad");
		// add last
		ll.addLast("Automation");

		System.out.println("Content of linked list is : " + ll);

		// get
		System.out.println(ll.get(0));

		// set
		ll.set(0, "Hello");
		System.out.println(ll.get(0));

		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.remove(2);
		System.out.println(ll);

		// how to print/iterate all the values
		// using for loop,advance for loop.iterator

		System.out.println("using for loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("using for advanced for loop");

		for (String str : ll) {
			System.out.println(str);
		}

		System.out.println("using iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("using While loop");
		int num = 0;
		while (ll.size() > 0) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}

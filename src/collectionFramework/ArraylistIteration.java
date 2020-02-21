package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistIteration {

	public static void main(String[] args) {

		ArrayList<String> tvseries=new ArrayList<String>();
		tvseries.add("Game of thrones");
		tvseries.add("Breaking bad");
		tvseries.add("Big bang theory");
		tvseries.add("The walking dead");
		tvseries.add("Prison break");
		
		//1. USing Java 8 with for each loop and lambda expression
		System.out.println("-------print using lambda exp----------");
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});
		
		
		System.out.println("-------print using iterator----------");
		
		//2. using iterator
		Iterator<String> it=tvseries.iterator();
		while(it.hasNext()) {
			String shows=it.next();
			System.out.println(shows);
		}
		
		
		//3.using iterator and java 8 lambda and  foreachremaining() method
		System.out.println("-------print using java 8 lambda and foreachremaining() method----------");
		
		it=tvseries.iterator();
		it.forEachRemaining(shows ->{
			System.out.println(shows);
		});
		
		//4.using for each loop
		
		System.out.println("-------print using for each loop------");
		for(String shows:tvseries) {
			System.out.println(shows);
		}
		
		
		//5.using for each loop
		
		System.out.println("-------print using for loop  with index-----------");
		for(int i=0;i<tvseries.size();i++) {
			System.out.println(tvseries.get(i));
			
		}
		
		//6.using a list iterator and to traverse in both the direction
		
		System.out.println("-------list iterator and to traverse in both the direction-----------");
		ListIterator<String> li=tvseries.listIterator(tvseries.size());
		while(li.hasPrevious()) {
			String shows=li.previous();
			System.out.println(shows);
		}
		
	}

}

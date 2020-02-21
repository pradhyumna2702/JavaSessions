package collectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapConcept {

	public static void main(String[] args) {

		// HashMap is a class which implements Map Interface , extends AbstractMap
		// It contains only unique elements.
		// It stores the values in the form of key and value pair.
		// It may have one null key and multiple null values.
		// It maintains no order.
		// Fail-fast condition--> concurrent modification exception-->not thread safe
		// DisadvantageWhen one thread is adding or removing the value and
		// simultaneously other thread is trying to access same value we get above exception
		// non synchronized and used in Multi-threading environment

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "selenium");
		m.put(2, "cucumber");
		m.put(3, "testNG");
		m.put(4, "RFT");

		System.out.println(m.get(1));
		System.out.println(m.get(4));

		for (Entry<Integer, String> hm : m.entrySet()) {

			int key = hm.getKey();
			String value = hm.getValue();

			System.out.println(key + "." + value);

		}

		System.out.println(m);
		m.remove(3);
		System.out.println(m);

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Tom", 25, "QA");
		Employee e2 = new Employee("Peter", 26, "DEV");
		Employee e3 = new Employee("Prads", 27, "Admin");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		System.out.println(e1.age);

		for (Entry<Integer, Employee> m1 : emp.entrySet()) {
			int key = m1.getKey();
			Employee e = m1.getValue();

			System.out.println(" Employee " + key + " info ");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}

	}

}

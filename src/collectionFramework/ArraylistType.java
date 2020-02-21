package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistType {

	public static void main(String[] args) {
		
		
	Employee e1=new Employee("prad",26,"dev");
	Employee e2=new Employee("Ran",25,"qa");	
	Employee e3=new Employee("var",27,"prod");
	Employee e4=new Employee("ani",30,"admin");
	
	ArrayList<Employee> al=new ArrayList<Employee>();
			
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
		
//	Iterator<Employee> it=al.iterator();
//	
//	while(it.hasNext()) {
//	Employee emp=it.next();//this will give e1,e2,e3 
//	
//	System.out.println(emp.name);
//	System.out.println(emp.age);
//	System.out.println(emp.dept);
//	}
	
	for(Employee emp:al) {
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		
	}

	
	System.out.println("****************");
	
	ArrayList<String> ar=new ArrayList<String>();
	ArrayList<String> ar1=new ArrayList<String>();
	
	ar.add("vyas");
	ar.add("vik");
	
	ar1.add("hello");
	ar1.add("tom");
	ar.addAll(ar1);
	
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
			
	}
	
	

	
	
	

}

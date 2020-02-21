package EncapsulationConcept;

public class EmployeeData {
	//HoW to implement encapsulation:
	
	//private data variables: So that these variables cannot be accessed directly from outside the class
	//Encapsulation is basically meant for hiding data.(Data Hiding)
	//High Level security
	//encapsulation is part of OOPS 
	
	private int ssn;
	private String name;
	private int age;

	public static void main(String[] args) {
		
		EmployeeData emp=new EmployeeData();
		emp.setName("prads");
		emp.setSsn(345678);
		emp.setAge(26);
		
		System.out.println("employee name is : "+emp.getName());
		System.out.println("employee age is :"+emp.getAge());
		System.out.println("employee ssn is :"+emp.getSsn());		
		
	}

	
	//public getter and setter methods: to set and get the values of the fields
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

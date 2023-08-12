package basics.listandfinalconcept;

public class Employee {

	String name;
	int age;
	String dept;
	
	//constructor : the global variables is different from constructor variables
					//so to make them as same use this keyword for initializing the values
	Employee(String name, int age, String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
}

package basics.oops3;

public class EmployeeData {

	/*Encapsulation : is a mechanism of wrapping the data (class variable) as single unit and to provide the 
					  data security.*/
	//1. Declare private class variables:
	private String name; //Achieving Encapsulation --> Encapsulation means hiding data
	private String empId;
	private int age;
	
//	public String getName(){
//		return name;
//	}
	
	//2. create public getter and setter --> set the value and get the value:
	//for every class variable, need to create one set() and one get()
	
	public void setName(String empName){
		name = empName;
	}
	
	public String getName(){
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

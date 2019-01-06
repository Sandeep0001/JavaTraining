package OOPConceptPart3;

public class TestEmployee {

	public static void main(String[] args) {

		EmployeeData emp = new EmployeeData();
		
		emp.setName("Tom");
		String empName = emp.getName();
		System.out.println(empName);
		
		emp.setAge(25);
		int age = emp.getAge();
		System.out.println(age);
		
		emp.setEmpId("6610");
		String empId = emp.getEmpId();
		System.out.println(empId);
	}

}

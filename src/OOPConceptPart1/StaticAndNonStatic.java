package OOPConceptPart1;

public class StaticAndNonStatic {

	/*global variables : the scope of global variables will be available across all the functions with 
						some condition*/
	
	String name = "Tom"; //non static global variable
	static int age = 25; //static global variable
	
	public static void main(String[] args) {

		//how to call static method and variables?
		//1. direct calling:
		sum();
		//2. calling by classname:
		StaticAndNonStatic.sum();
		
		//how to call static variables?
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//how to call non static methods and variables?
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access static methods using object reference? -> yes but its not a good practice
		obj.sum();
		
	}
	
	public void sendMail(){//non static method
		System.out.println("send mail method");
	}

	public static void sum(){//static method
		System.out.println("sum method");
	}
}

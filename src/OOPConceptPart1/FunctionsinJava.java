package OOPConceptPart1;

public class FunctionsinJava {
	// Main method -> starting point of execution
	public static void main(String[] args) {
		//functions and methods both are same thing
		FunctionsinJava obj = new FunctionsinJava();
		//one object will be created, obj is the reference variable
		//after creating the object, the copy of all non static methods will be given to this object
		
		obj.test(); //calling the test() method
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		//main method is void -- never returns a value
	}
    //non static methods : 
	//void (return type) means does not return any value
	//test() is method name
	public void test(){//no input, no output
		System.out.println("test method");
	}
	
	//return type is -- int
	public int pqr(){//no input, some output
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//return type is String
	public String qa(){//no input, some output
		System.out.println("QA Method");
		String s = "Selenium";
		
		return s;
	}
	
	//return type is int
	//x,y are input parameters/arguements
	public int division(int x, int y){//some input, some output
		System.out.println("Division Method");
		int d = x/y;
		
		return d;
		
	}
}

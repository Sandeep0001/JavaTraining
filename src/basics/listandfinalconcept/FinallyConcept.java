package basics.listandfinalconcept;

public class FinallyConcept {

	public static void main(String[] args) {

		test1();
		test2();
		div();
	}

	//finally is a block
	public static void test1(){
		try{
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("inside catch block");
		}
		finally//finally is used in association with try catch block
		{
			System.out.println("inside finally block");
		}
		
	}
	
	public static void test2(){
		try{
			System.out.println("inside test2 block");
		}
		finally{
			System.out.println("Inside finally block");
		}
		
	}
	
	public static void div(){
		int i = 10;
		try{
			System.out.println("inside div block");
			int k = i/0;
		}
		catch(ArithmeticException e){
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");
		}
		finally{
			System.out.println("execute this code even after exception");
		}
	}
}

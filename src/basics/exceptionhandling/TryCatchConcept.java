package basics.exceptionhandling;

public class TryCatchConcept {

	public static void main(String[] args) {

		System.out.println("test method");
		System.out.println("test method");
		System.out.println("test method");
		System.out.println("test method");
		
		try{
			int i = 9/0;
		}
		catch(Throwable e){
			e.printStackTrace();
			System.out.println("hi this is my exception");
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("test method");
		System.out.println("test method");
		System.out.println("test method");
	}

}

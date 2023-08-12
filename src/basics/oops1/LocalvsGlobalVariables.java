package basics.oops1;

public class LocalvsGlobalVariables {

	//Global variables -- class variables
	String name = "Tom";
	int age = 25;		
	public static void main(String[] args) {
		
		int i = 10;//Local variables
		System.out.println(i);
		
		LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
 
	public void sum(){
		int i = 10;//local variable for sum method
		int j = 20;
	}
}

package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(23.33);
		obj.sum(10);
		obj.sum(20, 30);
		obj.sum(29.2);

	}

	//main method also can be overload
	// you cannot create a method inside a method
	/*duplicate methods  -- i.e, same method name with same number of arguments are not allowed 
							but different data types are allowed*/
	
	//Method overloading --> when the method name is same with different arguments within the same class. 
	public void sum(){
		System.out.println("sum method -- zero poarameters");
	}
	
	public void sum(double i){
		System.out.println("sum method double -- single param");
		System.out.println(i);
	}
	
	public void sum(int i){
		System.out.println("sum method -- single param");
		System.out.println(i);
	}
	
	public void sum(int i, int j){
		System.out.println("sum method -- two param");
		System.out.println(i+j);
	}
}

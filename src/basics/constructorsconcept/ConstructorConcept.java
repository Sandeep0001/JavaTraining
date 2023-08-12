package basics.constructorsconcept;

public class ConstructorConcept {

	// constructor means : is a class entity which used to define some class features while creating object.
	//properties : 1. it looks like a function but its not a function
	//2. Cannot return any value
	//3. constructor name should be class name always
	//4. constructor can be overloaded
	
	public ConstructorConcept(){
		System.out.println("Default - Constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("single param const");
		System.out.println("the value of i:"+ i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("two param const");
		System.out.println("the value of i:"+ i);
		System.out.println("the value of j:"+ j);
	}
	
	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();/*Constructors will be called immediately after 
															creating object*/
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
	}

}

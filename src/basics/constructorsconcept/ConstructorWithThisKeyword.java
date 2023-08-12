package basics.constructorsconcept;

public class ConstructorWithThisKeyword {

	//class variables
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name = name;//this keyword is used to initialize the class variables
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);
		
	}

}

package basics.constructorsconcept;

public class B extends A{

	public B(){
		//super keyword should be written in the child class contructor
		//super keyword should be the first statement
		
		super();//super keyword is used to call parent class constructor
		System.out.println("child class const");
	}
	
	public B(int i){
		super(i);
	}
	
	public B(int i, int j){
		super(i, j);
	}
	
	public static void main(String[] args){
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);
	}
}

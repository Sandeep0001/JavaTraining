package OOPConceptPart1;

public class Car {
	
	//Class variables:
	int mod;
	int wheel;
	
	
	public static void main(String[] args) {
		
		//new Car(); -- this is the object of car class
		//new keyword is used to create the object
		//a,b,c are object reference variables
		
		Car a = new Car();//object a is created
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015; //class variables will be automatically given to all the objects 
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2017;
		c.wheel = 4;
		
		System.out.println("before assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after shifting the references");
		a=b;
		b=c;
		c=a;
		
		//after shifting reference variables shown as above now the condition for objects will be -- a and c will be pointing to b, b will be pointing to c and a is no reference.
		
		a.mod=10;
		System.out.println(a.mod);
		
		c.mod=20;
		System.out.println(a.mod);
	}

}

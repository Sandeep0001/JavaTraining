package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		//Static Polymorphism -- compile-time polymorphism
		/*same method name is overloaded with different type or number of parameters in same class 
		(different signature). Targeted method call is resolved at compile time.*/
		BMW b = new BMW();
		b.start();//start method is from child OR BMW class since preference will be given to child class
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("------------");
		
		//Top casting -- Car c1 
		Car c1 = new BMW();/*child class object can be referred by parent class reference variable 
							-- dynamic polymorphism -- Run-time polymorphism*/
		/*Dynamic polymorphism: Same method is overridden with same signature in different classes*/
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftSafety();//cannot be accessed by parent class
		
		//Down Casting -- BMW b1
		//BMW b1 = new Car();//its not allowed to down cast directly
		//BWM b1 = (BMW)new Car();//ClassCastException
	}

}

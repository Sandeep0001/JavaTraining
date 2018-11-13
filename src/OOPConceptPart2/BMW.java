package OOPConceptPart2;

public class BMW extends Car{//"has a relationship"
	
	/*Method Overriding: when same method is present in parent class(super class) as well as in 
	  					child class(sub class) with same name and same number arguments*/
						
	public void start(){//overriden method
		System.out.println("BMW----start");
	}
	
	public void theftSafety(){
		System.out.println("BMW---theftSafety");
	}

}

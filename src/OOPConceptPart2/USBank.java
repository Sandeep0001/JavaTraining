package OOPConceptPart2;

public interface USBank {
	//only method declaration
	//no method body -- only method prototype
	//in interface we can declare the variables, vars are by default static in nature
	// vars value will not be changed, its final/constant in nature
	//no static method in interface
	//no main method in interface
	// we cannot create the object of interface 
	//interface is abstract in nature -->abstract means we cannot instantiate

	int min_bal = 100;
	
	public void credit();//In interface we cannot have method body
	
	public void debit();
	
	public void transferMoney();
}

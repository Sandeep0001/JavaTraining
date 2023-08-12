package basics.oops2;

public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance
	//it is also called as "Is a Relationship"
	//we can achieve multiple inheritance only through Interfaces
	
	/*If a class is implementing any interface then its mandatory to define OR override 
	all the methods of interface*/
	//overriding from USBANK
	public void credit(){
		System.out.println("HSBC---credit");
	}

	public void debit(){
		System.out.println("hsbc---debit");
	}
	
	public void transferMoney(){
		System.out.println("hsbc---transfer money");
	}
	
	//Separate methods of HSBC bank
	public void educationLoan(){
		System.out.println("hsbc---eduLoan");
	}
	
	public void carLoan(){
		System.out.println("hsbc---carLoan");
	}
	
	//brazil bank method: overriding from BrazilBank
	public void mutualFund(){
		System.out.println("hsbc---mutualFund");
	}
}

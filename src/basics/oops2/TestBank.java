package basics.oops2;

public class TestBank {

	public static void main(String[] args) {

		/*USBank b = new USBank();//"Cannot instantiate the type USBank" because we cannot create object 
										for interface*/
		//Static polymorphism -- compile-time polymorphism
		
		System.out.println(USBank.min_bal);
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//Dynamic polymorphism : child class object can be referred by Parent Interface reference variable.
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//b.educationLoan(); --> cannot be accessed by USBank since it is the property of HSBCBank 
		
	}

}

package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args){

		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		
		try {
			throw new Exception("SandeepException");//Deliberately if you want to generate exception then use throw
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String name = "";
		if(name.equals("")){
			try {
				throw new Exception("No Data in Excel Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

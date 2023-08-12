package basics.listandfinalconcept;

public class FinalizeConcept {

	//finalize is a method not a keyword
	public void finalize(){//just for clean up process of object
		System.out.println("Finalize Method");
	}
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;// null -- object reference is removed
		f2 = null;
		
		System.gc();//garbage collector which is used to kill no reference objects
	}

}

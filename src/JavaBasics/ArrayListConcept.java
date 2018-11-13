package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(12.33);
		ar.add('A');
		ar.add(800);
		
		System.out.println(ar.size());
		
		ar.remove(8);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//to print all the values of array --> for loop
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		//Integer arrayList
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom");//error "The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)"
		
		//String arrayList
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
	}

}

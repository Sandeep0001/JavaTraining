package basics.listandfinalconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3];//static array -- size is fixeds
		
		//Dynamic arry - ArrayList
		//1. It can contain duplicate values/elements.
		//2. It maintains insertion order.
		//3. It is not synchronized.
		//4. It allows you random access to fetch any element because it storesTheValuesOnThe basisOfIndexes
		
		//non generic arraylist
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size()); //size of an arraylist
		
		ar.add(400);
		ar.add(400);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));//to get the value from an index
		
		//to print all the values from arraylist
		//1. for loop
		//2. using iterator
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		//non generic  vs generic:
		//generic arraylist
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(501);
		//ar1.add("Selenium");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Selenium");
		
		ArrayList<E> ar3 = new ArrayList<E>();/*if we are not aware what data type to be used then create
						<E> object and pass it to main Method. But this concept is not usually used.*/
		
		//Employee class objects:
		Employee e1 = new Employee("Sandeep", 25, "QA");
		Employee e2 = new Employee("Tom", 25, "Dev");
		Employee e3 = new Employee("John", 25, "Admin");
		
		//create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()){
			Employee emp = it.next();//it.next(); --> will fetch the employees data which was stored in 
										//iterator
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*******");
		//***********
		
		//addAll method: addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);//adAll merges the two different lists
		
		for(int i=0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		
		System.out.println("******");
		//removeAll()
		
		ar5.removeAll(ar6);//removeAll separates/removes the merged data list
		
		for(int i=0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		
		System.out.println("******");
		//retainAll() //it will print only common element
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Java");
		
		ar7.retainAll(ar8);
		
		for(int i=0;i<ar7.size();i++){
			System.out.println(ar7.get(i));
		}

	}

}

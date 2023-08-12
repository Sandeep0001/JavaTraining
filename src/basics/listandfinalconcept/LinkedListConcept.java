package basics.listandfinalconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>(); 
		
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFD");
		
		//print
		System.out.println("content of linked list:" +ll);
		
		//addfirst
		ll.addFirst("Sandeep");
		
		//addlast
		ll.addLast("Automation");
		
		System.out.println("content of linked list:" +ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list:" +ll);

		//remove:
		ll.remove(2);
		System.out.println("content of linked list:" +ll);
		
		//how to print all the values of linked list:
		//1. for loop
		
		System.out.println("using for loop");
		for(int n=0;n<ll.size();n++){
			System.out.println(ll.get(n));
		}
		//2. advance for loop -- for each loop
		System.out.println("using advance for loop");
		for(String str : ll){
			System.out.println(str);
		}
		//3. iterator
		System.out.println("using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//4. while loop
		System.out.println("using while loop");
		int num = 0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
		
		
	}

}

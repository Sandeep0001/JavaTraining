package JavaBasics;

import java.util.Hashtable;

public class HasTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(4,400);
		//h1.put("A", 100);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(5, "Lion");
		
		
	}

}

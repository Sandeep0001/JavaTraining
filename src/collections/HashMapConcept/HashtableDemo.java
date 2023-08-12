package collections.HashMapConcept;

import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args){

        Hashtable<String, Integer> marks = new Hashtable<>();
        marks.put("Sandeep", 99);
        marks.put("Naveen", 100);
        marks.put("Bindhu", 80);
        marks.put("Tom", 95);
        marks.put("Zoma", 45);

        System.out.println(marks.get("Sandeep")); //99


    }

}

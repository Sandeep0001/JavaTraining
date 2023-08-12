package collections.arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparision {

    public static void main(String[] args) {

        //1. Sort then equals:

        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println(l1.equals(l2));  //output is False

        System.out.println(l2.equals(l3));  // true

        //2. compare two list and find out the additional element

        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        l4.removeAll(l5);
        System.out.println(l4); //[F]

        //3. find out missing element:
        ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        l7.removeAll(l6);
        System.out.println(l7);  //[E]

        //4. Find out common elements:
        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "JS"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C#"));

        lang1.retainAll(lang2);
        System.out.println(lang1); //[Java, Python, Ruby]
    }
}

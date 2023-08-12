package collections.arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String[] args) {

        //default class available in Java
        //dynamic array

        //default generics:
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);
        ar.add("Hello");
        ar.add(3);
        ar.add(12.22);

        System.out.println(ar);

        System.out.println(ar.get(2));
        //System.out.println(ar.get(4)); //IndexOutOfBoundException

        ar.add(52);

        System.out.println(ar.size());


        //GenericArrayList  --> we should write wrapper class i.e Integer instead of int
        ArrayList<Integer> marksList = new ArrayList<Integer>();
        marksList.add(100);

        ArrayList<Double> arD = new ArrayList<Double>();
        arD.add(100.0);

        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Sandeep");


        //Different ways to iterate arraylist

        ArrayList<String> stdList = new ArrayList<String>();

        stdList.add("Tom");
        stdList.add("Rama");
        stdList.add("Sita");
        stdList.add("Shiva");

        //1. for loop
        for (int i = 0; i < stdList.size(); i++) {
            System.out.println(stdList.get(i));
        }

        System.out.println("Using Foreach loop");

        //2. foreach
        for (String s : stdList) {
            System.out.println(s);
        }

        System.out.println("Using Lambda function");

        //3. Jdk 8 -- lambda function
        stdList.stream().forEach(ele -> System.out.println(ele));

        System.out.println("using iterator");

        //4. iterator
        Iterator<String> it = stdList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //List with other collection:

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        System.out.println(numbers);

        ArrayList<String> langs = new ArrayList<String>(Arrays.asList("Java", "python", "CS"));
        System.out.println(langs);
    }
}

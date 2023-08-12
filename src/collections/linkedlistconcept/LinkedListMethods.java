package collections.linkedlistconcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args){

        //LL is default class in java
        //it can be used as List, Stack, Queue
        //it allows the null entry
        //it is dynamic collection
        //hence insertion and deletion can be easily implemented
        //it can contain duplicate elements
        //it is not synchronized (not thread safe)
        //in LL, manipulation is fast compared to Arrays because don't need any shifting.

        //LL constructors:

        //1. LinkedList(); --> Default constructor
        //2. LinkedList(Collection c);

        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.size());  //0

        names.add("Sandeep");
        names.add("Tom");

        System.out.println(names.size()); //2
        System.out.println(names); // [Sandeep, Tom]
        System.out.println(names.get(0)); //Sandeep

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next()); //Sandeep /n Tom
        }

        names.add("Shrinivas");
        names.add("Sharada");

        names.add(4, "Steve");
        System.out.println(names); //[Sandeep, Tom, Shrinivas, Sharada, Steve]

        names.add(2, "Rama");
        System.out.println(names); //[Sandeep, Tom, Rama, Shrinivas, Sharada, Steve]


        LinkedList<String> users = new LinkedList<>();

        users.add("Trump");
        users.add("Lakshman");
        users.add("Sita");

        names.addAll(users);
        System.out.println(names); //[Sandeep, Tom, Rama, Shrinivas, Sharada, Steve, Trump, Lakshman, Sita]

        names.addFirst("Modi");
        names.addLast("Dheeraj");
        System.out.println(names); //[Modi, Sandeep, Tom, Rama, Shrinivas, Sharada, Steve, Trump, Lakshman, Sita, Dheeraj]

        names.remove(2);
        System.out.println(names); //[Modi, Sandeep, Rama, Shrinivas, Sharada, Steve, Trump, Lakshman, Sita, Dheeraj]

        names.removeFirst();
        names.removeLast();
        System.out.println(names); //[Sandeep, Rama, Shrinivas, Sharada, Steve, Trump, Lakshman, Sita]

        names.clear();
        System.out.println(names);// []

        LinkedList<String> lang = new LinkedList<>();
        System.out.println(names.size());  //0

        lang.add("Java");
        lang.add("Python");
        lang.add("Ruby");
        lang.add("JS");

        System.out.println(lang.size());

        //reverse the linked list:

        Iterator<String> itr = lang.descendingIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            /*JS
            Ruby
            Python
            Java*/
        }

        for (String e : lang){
            System.out.println(e);
            /*
            * Java
                Python
                Ruby
                JS*/
        }

        //sort:
        Collections.sort(lang);
        System.out.println(lang); //[JS, Java, Python, Ruby]
    }
}

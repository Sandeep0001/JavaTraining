package collections.arraylistconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    //ThreadSafety concept
    public static void main(String[] args) {

        //1. Collections.synchronizedList
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");

        //add, remove --> we dont need explicit synchronization
        //to fetch/traverse the values from this list we have to use explicit synchronization

        synchronized (namesList) {
            Iterator<String> it = namesList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //2. copyOnWriteArrayList  -- its a class: Thread-safe / synchronized already
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Sandeep");
        empList.add("Naveen");
        empList.add("Devi");

        //we dont need any explicit synchronization for any operation: add, remove or traversing

        Iterator<String> it = empList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

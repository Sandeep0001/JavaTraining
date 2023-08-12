package collections.arraylistconcept;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {

    public static void main(String[] args) {

        ArrayList<Object> ar = new ArrayList<Object>(20); //Virtual capacity of arrayList is 10 by default

        System.out.println(ar.size()); //gives the physical capacity of an array i.e 0

        ar.add(100);

        System.out.println(ar.size()); //Using debugger mode we can virtual capacity
    }
}

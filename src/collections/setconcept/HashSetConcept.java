package collections.setconcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

    public static void main(String[] args){

        Set<String> hs = new HashSet<String>();

        hs.add("Alpha");
        hs.add("Testing");
        hs.add("Beta");
        hs.add("Alpha");
        hs.add(null);

        System.out.println(hs); //[null, Alpha, Testing, Beta]  --> Duplicate entries are not allowed in Set
        System.out.println(hs.contains("Testing")); //true

        for(String e : hs){
            System.out.println(e);
            /**
             * null
             * Alpha
             * Testing
             * Beta*/
        }

        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            /**
             * null
             * Alpha
             * Testing
             * Beta*/
        }


        hs.remove("Beta");
        System.out.println(hs); //[null, Alpha, Testing]


        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));

        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(new Integer[] {1,3,4,6,9}));

        //get the union
        Set<Integer> union = new HashSet<Integer>(first);
        union.addAll(second);

        System.out.println(union); //[1, 2, 3, 4, 5, 6, 7, 9]

        System.out.println("----------------");

        //get the intersection
        Set<Integer> intersection = new HashSet<Integer>(first);
        intersection.retainAll(second);

        System.out.println(intersection); //[1, 3, 4, 6]

        //get the differences
        Set<Integer> diff = new HashSet<Integer>(first);
        diff.removeAll(second);

        System.out.println(diff); //[2, 5, 7]


    }

}

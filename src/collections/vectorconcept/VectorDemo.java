package collections.vectorconcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> myVector = new Vector<>();
        myVector.add(1);
        myVector.add(3);
        myVector.add(6);
        myVector.add(4);
        myVector.add(9);
        myVector.add(10);

        System.out.println(myVector); //[1, 3, 6, 4, 9, 10]
        System.out.println(myVector.get(2));//6

        myVector.remove(3);
        System.out.println(myVector);//[1, 3, 6, 9, 10]

        Vector<Integer> yourVector = new Vector<>();

        yourVector.add(10);
        yourVector.add(11);

        myVector.addAll(yourVector);

        System.out.println(myVector); //[1, 3, 6, 9, 10, 10, 11]

        //iterate:
        for (Integer e : myVector) {
            System.out.println(e);
            /*1
                3
                6
                9
                10
                10
                11*/
        }

        for (int p = 0; p < myVector.size(); p++) {
            System.out.println(myVector.get(p));
            /*1
                3
                6
                9
                10
                10
                11*/
        }

        Iterator<Integer> it = myVector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            /*1
                3
                6
                9
                10
                10
                11*/
        }

        Collections.sort(myVector);
        System.out.println(myVector);//[1, 3, 6, 9, 10, 10, 11]
    }
}

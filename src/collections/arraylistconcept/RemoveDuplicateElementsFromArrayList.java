package collections.arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,5,3,2,5,7,8));

        //1. LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> numberListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
        System.out.println(numberListWithoutDuplicate);

        //2. JDK 8 --- Stream:

        ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1,2,2,5,5,3,6,8,4,22,2,5,1));
        List<Integer> marksListUnique = marks.stream().distinct().collect(Collectors.toList());

        System.out.println(marksListUnique);
    }

}

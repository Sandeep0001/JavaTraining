package collections.arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Java");
        ar1.add("Python");
        ar1.add("JS");
        ar1.add("AJS");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Testing");
        ar2.add("Devops");

//        ar1.addAll(ar2); //combine two array list
//
//        System.out.println(ar1);
//
//        ar1.addAll(2, ar2); //it will start adding ar2 list from second index
//        System.out.println(ar1);
//
//        ar1.clear();  //to create empty arraylist or to clear the list
//        System.out.println(ar1);

        ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
        System.out.println(cloneList);

        System.out.println(ar1.contains("Python"));

        System.out.println(ar1.indexOf("JS") > 0);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Sandeep", "Shiva", "Sandeep", "Jesus", "Ravana", "Sandeep"));
        System.out.println(list1);

        int i = list1.lastIndexOf("Sandeep");
        System.out.println(i); //output is 5

        int j = list1.lastIndexOf("test");
        System.out.println(j); //output is -1

        list1.remove(2); //to delete index value
        System.out.println(list1);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println(numbers);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Sandeep", "Shiva", "Sandeep", "Jesus", "Ravana", "Sandeep"));
        System.out.println(namesList);

        namesList.retainAll(Collections.singleton("Sandeep"));
        System.out.println(namesList); // output will be ["Sandeep", "Sandeep", "Sandeep"]


        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
        ArrayList<Integer> sublist = new ArrayList<>(numbers1.subList(2, 6));
        System.out.println(sublist); // output is [3, 4, 5, 6]


        ArrayList<String> newlist = new ArrayList<>(Arrays.asList("Sandeep", "Shiva", "Sandeep", "Jesus", "Ravana", "Sandeep"));
        Object[] arr = newlist.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o : arr) {
            System.out.println(o);
        }
    }
}

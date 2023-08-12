package collections.hashmapconcept;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10000, "Tom");
        map.put(2000, "Jerry");
        map.put(3000, "Shiva");
        map.put(11000, "Sandeep");
        map.put(14000, "Naveen");

        System.out.println(map); //{2000=Jerry, 3000=Shiva, 10000=Tom, 11000=Sandeep, 14000=Naveen}

        map.forEach((k, v) -> System.out.println("Key = " + k + "Values = " + v));
        /*Key = 2000Values = Jerry
            Key = 3000Values = Shiva
            Key = 10000Values = Tom
            Key = 11000Values = Sandeep
            Key = 14000Values = Naveen*/

        System.out.println(map.lastKey()); //14000
        System.out.println(map.firstKey()); //2000

        Set<Integer> keyLessThan3k = map.headMap(3000).keySet();
        System.out.println(keyLessThan3k); //[2000]

        Set<Integer> keyGreaterThan3k = map.tailMap(3000).keySet();
        System.out.println(keyGreaterThan3k); //[3000, 10000, 11000, 14000]


        TreeMap<String, Integer> userMap = new TreeMap<>();
        userMap.put("Sandeep", 100);
        userMap.put("Anu", 120);
        userMap.put("Ganesha", 10);
        userMap.put("Rama", 18);
        userMap.put("Balu", 1000);

        userMap.forEach((k, v) -> System.out.println("Key = " + k + " Values = " + v));
        /*Key = Anu Values = 120
                Key = Balu Values = 1000
                Key = Ganesha Values = 10
                Key = Rama Values = 18
                Key = Sandeep Values = 100*/
        //For tree map it will always sort the keys


        //to print map i reverse order
        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());

        map1.put(10000, "Tom");
        map1.put(2000, "Jerry");
        map1.put(3000, "Shiva");
        map1.put(11000, "Sandeep");
        map1.put(14000, "Naveen");

        map1.forEach((k, v) -> System.out.println("Keys = " + k + " Values = " + v));
        /*
        Keys = 14000 Values = Naveen
        Keys = 11000 Values = Sandeep
        Keys = 10000 Values = Tom
        Keys = 3000 Values = Shiva
        Keys = 2000 Values = Jerry*/
    }
}

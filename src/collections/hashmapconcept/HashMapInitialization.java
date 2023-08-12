package collections.hashmapconcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

    public static Map<String, Integer> marksMap;

    static {
        marksMap = new HashMap<>();
        marksMap.put("A", 100);
        marksMap.put("B", 200);
    }

    public static void main(String[] args){
        //1. using HashMap class

        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>(); //TopCasting

        //2. static way: static HasMap
        System.out.println(HashMapInitialization.marksMap.get("A")); //100

        //3. immutableMap with on;y single entry
        Map<String ,Integer> map3 = Collections.singletonMap("test", 100);
        System.out.println(map3.get("test"));
        //map3.put("ABC", 200);  //output error: java.lang.UnsupportedOperationException

        //4. JDK 8:
        //creating one 2D array of Strings using Stream and collecting in the form of Map
        Map<String ,String> map4 = Stream.of(new String[][]{
                {"Tom", "A grade"},
                {"Jerry", "B grade"},
        }).collect(Collectors.toMap(data ->data[0], data -> data[1]));
        System.out.println(map4.get("Tom"));

        map4.put("Lisa", "A++ grade");
        System.out.println(map4.get("Lisa"));

        //5.Using SimpleEntry:  mutable map
        Map<String, String> map5 = Stream.of(new AbstractMap.SimpleEntry<>("Naveen", "Java"),
                new AbstractMap.SimpleEntry<>("Tom", "Python")
                ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map5.get("Naveen"));  //Java

        map5.put("Sandeep", "C#");
        System.out.println(map5.get("Sandeep")); //C#

        //6. Using SimpleEntry : Immutable map
        Map<String, String> map6 = Stream.of(new AbstractMap.SimpleImmutableEntry<>("Naveen", "Java"),
                new AbstractMap.SimpleImmutableEntry<>("Tom", "Python")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map6.get("Naveen"));  //Java

        map5.put("Sandeep", "C#");
        System.out.println(map6.get("Sandeep")); //null

        //7. JDK 1.9:
        //empty map:
        //Map<String, String> emptyMap = Map.of(); -> Creates empty map
        //emptyMap.put("Tom", "Python");  -> Cannot add any item to empty map
        //System.out.println(emptyMap.get("Tom")); //UnsupportedOperationException


        //8. SingletonMap : JDK 1.9
        //Map<String, String> singletonMap = Map.of("k1", "v1"); // to achieve single key or singleton map
        //System.out.println(singletonMap.get("k1"));


        //10. multi value maps : maximum it supports 10 key-value pair
        //Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
        //System.out.println(multiMap.get("k3")); //v3


        //11. ofEntries Method: no limitation of k-v pair  --> JDK 1.9
        // Immutable Maps:
//        Map<String, Integer> map7 = Map.ofEntries(
//                new AbstractMap.SimpleEntry<>("A", 100),
//                new AbstractMap.SimpleEntry<>("B", 200),
//                new AbstractMap.SimpleEntry<>("C", 300)
//        );
//        System.out.println(map7.get("A")); //100
//        map7.put("D", 400);
//        System.out.println(map7.get("D")); //UnsupportedOperationException


        //12. maps using Guava: from google
//        Map<String, String> titleMaps = ImmutableMap.of("Google", "Google India", "Amazon", "Amazon Shopping");
//        System.out.println(titleMaps.get("Amazon")); //Amazon Shopping
//        titleMaps.put("Rediff", "Rediff title");
//        System.out.println(titleMaps.get("Rediff")); //UnsupportedOperationException

    }


}

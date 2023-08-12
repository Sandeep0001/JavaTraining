package collections.HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

    public static void main(String[] args){

        //synchronizedMap method in collection class:
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("1", "Sandeep");
        map1.put("1", "Shiva");
        map1.put("1", "Rama");

        //create syncronizedMap
        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);


        //ConcurrentHashMap: it does not throw any ConcureentModificationException
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", "Java");
        concurrentMap.put("B", "Python");
        concurrentMap.put("C", "C#");

        System.out.println(concurrentMap.get("A"));
    }

}

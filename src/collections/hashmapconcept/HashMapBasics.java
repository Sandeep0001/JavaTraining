package collections.hashmapconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args){

        //1. No ordering -- i.e it doesn't store elements in order
        //2. No indexing
        //3. Stores the value in key - va;ues format
        //4. Key should be unique --> if we use duplicate key then latest key value will be considered
        //5. Can store n number of null values but only one null key
        //6. HashMap is not thread safe / synchronized

        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("India", "Delhi");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("UK", "London11");
        capitalMap.put(null, "Berlin");
        capitalMap.put(null, "LA");
        capitalMap.put("Russia", null);
        capitalMap.put("France", null);
        capitalMap.remove("France");

        System.out.println(capitalMap.get("USA")); //Washington DC
        System.out.println(capitalMap.get("Germany")); //null
        System.out.println(capitalMap.get("UK")); //London11
        System.out.println(capitalMap.get(null)); //Berlin


        //iterator: over the keys: by using keySet()
        Iterator<String> it = capitalMap.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("Key=" + key +  " Value = " + value);
        }



        //iterator: over the set (pair) : by using entrySet

        Iterator<Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry<String,String> entry = it1.next();
            System.out.println("key = " + entry.getKey() + " Value = " + entry.getValue());
        }

        //iterator: hashmap using java 8 for each and lambda

        capitalMap.forEach((k,v) -> System.out.println("Key = " + k + " Value = " + v));








    }

}

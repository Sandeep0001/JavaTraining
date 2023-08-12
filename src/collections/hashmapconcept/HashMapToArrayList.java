package collections.hashmapconcept;

import java.util.*;

public class HashMapToArrayList {

    public static void main(String[] args) {

        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Google", 10000);
        compMap.put("Walmart", 20000);
        compMap.put("FB", 30000);
        compMap.put("Twitter", 40000);
        compMap.put("Cisco", 50000);

        System.out.println("comp map size: " + compMap.size()); //output is 5

        Iterator it = compMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + "=" + pairs.getValue());
        }

        //convert hashMap key into  ArrayList:
        List<String> compNamesList = new ArrayList<String>(compMap.keySet());
        for (String t : compNamesList) {
            System.out.println(t); /*Google
                                    Walmart
                                    Cisco
                                    Twitter
                                    FB*/
        }

        //convert hashMap values into  ArrayList:
        List<Integer> compEmpCount = new ArrayList<>(compMap.values());
        System.out.println(compEmpCount); //[10000, 20000, 50000, 40000, 30000]
        for (Integer i : compEmpCount) {
            System.out.println(i); /*10000
                                        20000
                                        50000
                                        40000
                                        30000*/
        }

        long max = Collections.max(compMap.values());
        System.out.println("Max value in a map is:" + max); //5000

        compMap.forEach((k, v) -> System.out.println("Key = " + k + " Values = " + v));
        /*
        Key = Google Values = 10000
        Key = Walmart Values = 20000
        Key = Cisco Values = 50000
        Key = Twitter Values = 40000
        Key = FB Values = 30000
        * */

    }
}

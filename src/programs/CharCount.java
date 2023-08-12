package programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

    //test --> t=2, e=1, s=1
    //test auto --> t=3, e=1, s=1, a=1, o=1, u=1

    public static void getCharCount(String str){

        Map<Character, Integer> hashMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()){
            //if (!String.valueOf(c).isBlank()) {
                hashMap.put(c, hashMap.containsKey(c) ? hashMap.get(c) + 1 : 1);
            //}
        }

        /*for (Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/

        System.out.println(str + ": " + hashMap);
    }

    public static void main(String[] args) {
        getCharCount("test auto"); //test auto: {t=3, e=1, s=1,  =1, a=1, u=1, o=1}
    }

}

package JavaBasicPrograms;

import java.util.*;

public class PrintMaxRepeatedWord {


    public static void  printMaxWord(String str){

        String s[] = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s1 : s){
            map.put(s1, map.containsKey(s1) ? map.get(s1) + 1 : 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));


        System.out.println(list.get(list.size()-1));


    }


    public static void main(String[] args) {

        printMaxWord("Hello Java, Hello C#");

    }

}

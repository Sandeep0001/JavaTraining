package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    //WAP to print duplicate characters from string

    public static void main(String[] args) {

        printDuplicateCharacters("A"); //Single char string
        printDuplicateCharacters(""); //Empty string
        printDuplicateCharacters(null); //Null String
        printDuplicateCharacters("Java"); //a:2
        printDuplicateCharacters("1000"); //0:3
        printDuplicateCharacters("007 hey "); //0:2 and  :2 (space is also counted)
        printDuplicateCharacters(" ");//Single char string


    }

    public static void printDuplicateCharacters(String str){

        if (str == null){
            System.out.println("Null String");
            return;
        }

        if (str.isEmpty()){
            System.out.println("Empty string");
            return;
        }

        if (str.length()==1){
            System.out.println("Single char string");
            return;
        }

        char words[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : words){
            if (charMap.containsKey(ch)){

                charMap.put(ch, charMap.get(ch)+1);
            }
            else{
                charMap.put(ch, 1);
            }
        }

        //print the map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }


}

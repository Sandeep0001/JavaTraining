package JavaBasicPrograms;

import java.util.*;

public class ReplaceDuplicateCharInString {


    //WAP to replace duplicate elements with $

    public static void main(String[] args) {

        char c[] = "Sandeeep".toCharArray();


        List<Character> list1 = new ArrayList<>();

        for (char c2 : c) {

            if (list1.contains(c2)) {
                list1.add('$');
            } else {
                list1.add(c2);
            }
        }

        System.out.println(list1.toString());

    }
}

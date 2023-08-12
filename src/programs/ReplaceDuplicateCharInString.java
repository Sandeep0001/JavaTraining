package programs;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class ReplaceDuplicateCharInString {


    //WAP to replace duplicate elements with $

    public static void main(String[] args) {

        char c[] = "Sandeeep".toCharArray();


        List<Character> list = new ArrayList<>();

        for (char c2 : c) {

            if (list.contains(c2)) {
                list.add('$');
            } else {
                list.add(c2);
            }
        }

        String delim = "";
        String res = StringUtils.join(list, delim);

        System.out.println(res); //Sande$$p

    }
}

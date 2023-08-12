package programs;

import java.util.Arrays;

public class ConsecutiveLettersInString {

    //WAP to find if string contains consecutive letters

    public static boolean findConsecutiveLetters(String str){

        char c[] = str.toCharArray();

        Arrays.sort(c);

        for (int i=1;i<c.length;i++){
            if (c[i] - c[i-1] != 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(findConsecutiveLetters("abc")); //true
        System.out.println(findConsecutiveLetters("cab")); //true
        System.out.println(findConsecutiveLetters("acd")); //false

    }



}

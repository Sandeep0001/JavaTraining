package programs;

import com.google.common.base.CharMatcher;

import java.util.function.IntPredicate;

public class VowelsCount {
    
    /**
     * total number of vowels within a java String using:
     * Java
     * Java 8,
     * and Google guava library
     *
     * aeiou
     * */

    //Java:
    public static boolean isVowel(char t){
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
        t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';

    }

    public static void main(String[] args) {

        String str = "testing";
        int count =0;

        for(int x = 0; x<str.length();x++){
            if (isVowel(str.charAt(x))){
                count++;
            }
        }
        System.out.println(count); //2


        //Java 8 streams
        System.out.println("Using java 8 streams");

        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                        t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
            }
        };

        String test = "Sandeep I S";
        long c = test.chars().filter(vowel).count();
        System.out.println(c); //4

        //Using Google Guava:
        String st = "java Example";
        int vcount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
        System.out.println(vcount); //5


    }
    
    
}

package JavaBasicPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseEveryWordInString {

    /** Input: Sandeep is Presenting
     Output: peednaS si gnitneserP */

    public static void main(String[] args) {

        String str = "Hi welcome to Java programming";
        reverseWords(str);
        reverseWordsUsingStream(str);
    }

    public static void reverseWords(String str){

        Stack<Character> stack = new Stack<>();

        for (int i=0;i<str.length();i++){

            if (str.charAt(i) != ' '){
                stack.push(str.charAt(i));
            }else{
                while (stack.empty() == false){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }

        }

        while (stack.empty() == false){
            System.out.print(stack.pop());
        }
        System.out.println();

    }


    //2. Using Streams

    public static void reverseWordsUsingStream(String str){

        String reversedString = Arrays.asList(str.split(" ")).stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedString);
    }


}




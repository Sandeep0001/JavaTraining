package programs;

import org.apache.commons.lang3.StringUtils;

public class CharacterOccurrence {

    //WAP to count occurrences of a  character in String

    public static void main(String[] args) {

        String str = "I love coding and testing";

        //CharArray -- for loops
        //str.len -- charAt(i)
        //Apache Common StringUtils  --> download jar / binaries from https://commons.apache.org/proper/commons-lang/download_lang.cgi and add to the libraries /classpath
        //Streams

        getCharOccurrences(str, 'g'); //g:2
        getCharCount(str, 'i'); //i:2
        getCharCountsUsingStreams(str, "i");//i:2


        System.out.println("-------------------------------------");

        int count = StringUtils.countMatches(str, "o");
        System.out.println(count);//2

    }

    public static void getCharCountsUsingStreams(String str, String val){

        long count = str.chars().mapToObj(e -> String.valueOf((char) e))
                .filter(e -> e.equals(val)).count();

        System.out.println(val + ":" + count);
    }

    public static void getCharOccurrences(String str, char val){

        int count =0;

        for (char ch : str.toCharArray()){
            if (ch == val){
                count++;
            }
        }
        System.out.println(val + ":" + count);

    }

    public static void getCharCount(String str, char val){
        int count =0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == val){
                count++;
            }
        }
        System.out.println(val + ":" + count);
    }

}

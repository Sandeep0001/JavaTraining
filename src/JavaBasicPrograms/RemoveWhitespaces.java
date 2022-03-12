package JavaBasicPrograms;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhitespaces {

    //Remove all whitespaces from the given string

    public static void main(String[] args) {

        String str = "      This is my string   ";
        String str1 = "      This    is         my        string   ";

        System.out.println(str.trim());  //This is my string

        System.out.println(str1.replaceAll("\\s+", ""));//Thisismystring

        String str1Result = StringUtils.deleteWhitespace(str1);
        System.out.println(str1Result); //Thisismystring

        String noWhiteSpace = "";
        for (int i=0;i<str1.length();i++){

            if (str1.charAt(i) != ' ' && str1.charAt(i) != '\t'){
                noWhiteSpace += str1.charAt(i);
            }
        }

        System.out.println(noWhiteSpace);  //Thisismystring


        String newString = " Hello World " +
                "\n remove Whitespace" +
                "\t Using Java";

        System.out.println(newString);

        String newArr[] = newString.split("\\s");
        StringBuffer remWhitespace = new StringBuffer();
        for (String s : newArr){
            remWhitespace.append(s);
        }

        System.out.println(remWhitespace);
        /**
         *  Hello World
         *  remove Whitespace	 Using Java
         * HelloWorldremoveWhitespaceUsingJava
         *
         * */




    }



}

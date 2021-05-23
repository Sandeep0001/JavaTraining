package JavaBasicPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

    //how to find length of th string without using length method

    public static void main(String[] args) {

        String str = "testing";

        System.out.println(str.toCharArray().length);//7

        System.out.println(str.lastIndexOf(""));//7

        Matcher m = Pattern.compile("$").matcher(str);
        m.find();
        int len = m.end();
        System.out.println(len); //7

        System.out.println(str.split("").length); //7

        /*int l =new StringBuilder(str).length();
        System.out.println(l);//7 */

        int counter =0;
        for (char c: str.toCharArray()){
            counter++;
        }
        System.out.println(counter);//7


        System.out.println(getLength("Sandeep Java")); //12


        int l1 =0;
        try{
            l1 = str.getBytes("UTF-16BE").length/2;
        }
        catch (Exception e){

        }
        System.out.println(l1);


        System.out.println(getStringLength("Hello World"));//11

    }


    public static int getLength(String str){

        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        }
        catch (IndexOutOfBoundsException e){
            return i;
        }
    }


    public static int getStringLength(String str){
        String st[] = str.split("");

        int count = 0;

        for (String s : st){
            count += s.toCharArray().length;
        }

        return count;
    }

}

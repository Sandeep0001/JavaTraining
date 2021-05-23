package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Codezeros {

    /**
     * Samay Thakkar12:26 PM
     * arr1= {"a","b","-","e","d","-","o","w","-"}
     * Samay Thakkar12:36 PM
     * out = {"a","e","o"}
     * */


    public static void main(String[] args) {

        int j;
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","-","e","d","-","o","w","-"));

        ArrayList<String> list1 = new ArrayList<>();



        for(int i=0; i< list.size();i++){
            list1.add(list.get(i));
            if(list.get(i) == "-") {
                j = list1.size() - 1 ;
                list1.remove(j);
                list1.remove(j-1);
            }
        }

        System.out.println(list1); //[a, e, o]


    }

}

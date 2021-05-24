package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Codezeros {

    /**
     * Samay Thakkar12:26 PM
     * arr1= {"a","b","-","e","d","-","o","w","-"}
     * Samay Thakkar12:36 PM
     * out = {"a","e","o"}
     * */


    public static void main(String[] args) {

        //1. Implementation using ArrayList()

        int j;
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","-","e","d","-","o","w","-"));

        ArrayList<String> list1 = new ArrayList<>();



        for(int i=0; i< list.size();i++){
            if(list.get(i) == "-") {
                j = list1.size() - 1 ;
                list1.remove(j);
            }else{
                list1.add(list.get(i));
            }
        }

        System.out.println(list1); //[a, e, o]



        //2. Implementation using stack

        Stack<String> stk = new Stack<>();

        for(int i=0; i< list.size();i++){

            if(list.get(i) == "-"){
                stk.pop();
            }else{
                stk.push(list.get(i));
            }
        }

        System.out.println(stk);

    }

}

package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintStringWithNonRepeatedChar {

    //WAP to print String which has no repeated char in it

    public static void nonRepeatedCharInString(String[] str){

        List<String> charRepeatedList = new ArrayList<>();
        List<String> charNotRepeatedList = new ArrayList<>();

        for (String s : str){

            Map<Character, Long> map = s.toLowerCase().chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            boolean b = checkDuplicateChar(map);

            if (b){
                charRepeatedList.add(s);
            }else{
                charNotRepeatedList.add(s);
            }

        }

        System.out.println(charNotRepeatedList);

    }


    public static boolean checkDuplicateChar(Map<Character, Long> map){

        for (Map.Entry<Character, Long> entry : map.entrySet()){
            if (entry.getValue() > 1){
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {

        String[] arr = {"Kolkata", "Mumbai", "Pune", "Delhi"};
        nonRepeatedCharInString(arr);

    }

}

package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintNonRepeatingCharacter {

    //"abbccc" -> a

    public static void nonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();

        Map<Character, Long> counter = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Character, Long> entry : counter.entrySet()){

            if (entry.getValue() == 1){
                System.out.print(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        nonRepeatingChar("abccddeeffrrrrrr"); //ab
    }
}

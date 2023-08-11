package JavaBasicPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class DialPadCombinationsUsingStreams {

    private static final Map<Character, String> dialPadLetters = new HashMap<>();

    static {
        dialPadLetters.put('2', "abc");
        dialPadLetters.put('3', "def");
        dialPadLetters.put('4', "ghi");
        dialPadLetters.put('5', "jkl");
        dialPadLetters.put('6', "mno");
        dialPadLetters.put('7', "pqrs");
        dialPadLetters.put('8', "tuv");
        dialPadLetters.put('9', "wxyz");
    }

    public static List<String> getDialPadCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        result.add("");

        for (char digit : digits.toCharArray()) {
            String letters = dialPadLetters.get(digit);
            if (letters == null) {
                continue;
            }

            result = result.stream()
                    .flatMap(prefix -> letters.chars().mapToObj(letter -> prefix + (char) letter))
                    .collect(Collectors.toList());
        }

        return result;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = getDialPadCombinations(digits);
        //combinations.forEach(System.out::println);
        System.out.println(combinations); //[ad, ae, af, bd, be, bf, cd, ce, cf]
    }

}

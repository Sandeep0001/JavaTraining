package JavaBasicPrograms;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostFrequentCharacter {

    //Write a Java program to find the second most frequent character in string

    public static char nMostCommon(String str, int n) {
        Map<Character, Long> counter = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if (counter.size() < n) {
            throw new IllegalArgumentException("Not enough different characters.");
        }
        return counter.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .get(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(nMostCommon("aabbbcccc", 2));//b
        System.out.println(nMostCommon("ab", 2));//b
    }

}

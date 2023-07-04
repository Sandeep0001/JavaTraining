package JavaBasicPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintMaxRepeatedWord {

    public static void  printMaxWord(String str){
        String s[] = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s1 : s){
            map.put(s1, map.containsKey(s1) ? map.get(s1) + 1 : 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());

        System.out.println(list.get(list.size()-1));
    }

    public static void  printMaxWordUsingStreams(String str){
        Map<String, Long> map = Arrays.asList(str.replaceAll("\\.|\\,*", "").split(" ")).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> listEntry = new LinkedList<>(map.entrySet());
        OptionalInt max = listEntry.stream().mapToInt(e -> Math.toIntExact(e.getValue())).max();

        System.out.println(map.entrySet().stream().filter(e -> e.getValue() == max.getAsInt()).map(Map.Entry::getKey).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        printMaxWord("Hello Java, Hello C#");
        printMaxWordUsingStreams("Hello Java, Hello C#, Java");
    }
}

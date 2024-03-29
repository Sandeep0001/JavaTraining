package programs;

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

    public static void  printMaxWordUsingStreamsAndCollections(String str){
        Map<String, Long> map = Arrays.stream(str.replaceAll("\\.|,*", "").toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map.entrySet().stream().filter(e -> Objects.equals(e.getValue(), Collections.max(map.values()))).map(Map.Entry::getKey).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        printMaxWord("Hello Java, Hello C#");
        printMaxWordUsingStreams("Hello Java, Hello C#, Java"); //[Java, Hello]
        printMaxWordUsingStreamsAndCollections("Hello Java, hello C#, Java"); //[java, hello]
    }
}

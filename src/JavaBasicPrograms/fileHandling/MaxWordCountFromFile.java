package JavaBasicPrograms.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCountFromFile {

    static String path = "src/JavaBasicPrograms/fileHandling/test.txt";

    public static void main(String[] args) {

        HashMap<String, Integer> wordMap = new HashMap<>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] words = currentLine.toLowerCase().replaceAll("\\.|\\,*", "").split(" ");

                for (String word : words) {
                    if (!word.isBlank()) {
                        wordMap.put(word, wordMap.containsKey(word) ? wordMap.get(word) + 1 : 1);
                    }
                }
                currentLine = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //wordMap.forEach((k, v) -> System.out.println(k + " : " + v));

        Map<String, Integer> maxMap = new HashMap<>();

        wordMap.entrySet().stream().filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
                .forEach(e -> maxMap.put(e.getKey(), e.getValue()));

        System.out.println(maxMap);

    }


}

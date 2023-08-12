package programs.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

    //Count total chars, words and lines in a given file

    static String path = "src/JavaBasicPrograms/fileHandling/test.txt";

    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine().trim();

            while (currentLine != null){

                lineCount++;

                //words:
                String words[] = currentLine.split(" ");
                wordCount += words.length;

                //char:
                for (String word : words){
                    charCount += word.length();
                }

                currentLine = reader.readLine();
            }

            System.out.println("total lines : " + lineCount); //6
            System.out.println("total words : " + wordCount);  //67
            System.out.println("total characters : " + charCount); //392

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}

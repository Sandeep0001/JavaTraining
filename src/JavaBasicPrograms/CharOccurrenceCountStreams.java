package JavaBasicPrograms;

public class CharOccurrenceCountStreams {

    //Count the number of Occurrences of a given character in a string using java 8 streams?

    public static void main(String[] args) {

        String str = "testing solutions";
//
//        long count = str.chars()
//                .filter(e -> (char) e == 'i' || (char) e == 's')
//                .count();

//        System.out.println(count);//5

        System.out.println(getCharCount(str, 's'));//3


    }

    public static long getCharCount(String str, char c){
        return str.chars()
                .filter(e -> (char) e == c)
                .count();
    }

}

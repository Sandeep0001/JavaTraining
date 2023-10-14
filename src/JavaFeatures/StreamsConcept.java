package JavaFeatures;

import java.util.*;
import java.util.stream.Stream;

public class StreamsConcept {

    public static void main(String[] args) {

        //JDK 8:
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
        /**
         * 2
         * 4
         * 6
         * 8
         * 10*/

        Stream.of("Hello", "Java")
                .map(e -> e + " World")
                .forEach(System.out::println);
        /**
         * Hello World
         * Java World*/


        //optional class:
        String[] s = new String[5];
        s[2] = "Sandeep";
        //System.out.println(s[2].length()); //java.lang.NullPointerException
        // to avoid exceptions we can use Optional class
        Optional<String> isNull = Optional.ofNullable(s[2]);

        if (isNull.isPresent()) {
            System.out.println(s[2] + " " + s[2].length());
        } else {
            System.out.println("Value is not available");
        }

        isNull.ifPresent(e -> System.out.println(e.length())); //7


        Optional<String> nothing = Optional.empty();
        nothing.ifPresent(e -> System.out.println("Bye....")); //


        //JDK 9:
        //Jshell


        //factory methods for immutable collections:
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<String> lang = List.of("Java", "Python", "Ruby");

        lang.forEach(System.out::println);

        //JDK 10: var keyword is introduced
        var x = 10;
        System.out.println(x);
        var y = "Hello";
        System.out.println(y);

        var h = new HashSet<String>();
        h.add("Sandeep");

        var arr = new ArrayList<String>();
        arr.add("Naveen");

        //new switch case in JDK 12:

        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                break;

            case "ff":
                break;

            default:
                break;
        }

        //new switch case
        var n = 3;
        var m = switch (n) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            default -> "number not found";
        };
        System.out.println(m);  //three


        //JDK 13: multi line string support
        //json, xml

        var response = """
                {
                "name" : "Sandeep",
                "age" : "27"
                }""";
        System.out.println(response);
        /**
         * {
         * "name" : "Sandeep",
         * "age" : "27"
         * }*/

        //JDK 14: Data class got introduced
        Employee e1 = new Employee("Sandeep", 27);
        System.out.println(e1.name());
        System.out.println(e1.age());

        //JDK 15: sealed class
    }
}

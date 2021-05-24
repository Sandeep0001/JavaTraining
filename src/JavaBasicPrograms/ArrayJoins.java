package JavaBasicPrograms;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayJoins {

    //Join two arrays using Java 8 and Google Guava library

    public static void main(String[] args) {
        String[] batsman = {"Rohit","Kolhi","Dhawan","Dhoni","Shreya","Rishabh"};
        String[] bowlers = {"Hardik","Bhuvi","Bumrah","Chahal","Jaddu"};

        //1. With Java 8
        Stream<String> sBat = Arrays.stream(batsman);
        Stream<String> sBow = Arrays.stream(bowlers);

        String[] fullTeam = Stream.concat(sBat,sBow).toArray(size -> new String[size]);

        for (String s : fullTeam){
            System.out.println(s);
        }

        System.out.println("------------------------------------------");

        //2. with Google Guava
        //for Object arrays:
        String[] team = ObjectArrays.concat(batsman, bowlers, String.class);

        for (String st: team){
            System.out.println(st);
        }

        System.out.println("----------------");

        //for primitive types arrays:
        int p1[] = {1,2,3,4,5};
        int p2[] = {6,7,8,9,10};

        int p3[] = Ints.concat(p1,p2);

        for (int i : p3){
            System.out.println(i);
        }

    }
}

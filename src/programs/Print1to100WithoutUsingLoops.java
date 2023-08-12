package programs;

import java.util.stream.IntStream;

public class Print1to100WithoutUsingLoops {

    //We can do it by using following types
    //1. Recursive --> i.e calling function by itself
    //2. Java Stream

    public static void main(String[] args){
        printNum(1);
        printNumber1(5, 500);

        IntStream.range(1, 101).forEach(e -> System.out.println(e));  // Java Stream
    }

    public static void printNum(int num){
        if(num<=100){
            System.out.println(num);
            num++;
            printNum(num); //recursive function
        }
    }

    public static void printNumber1(int stnum, int endnum){
        if(stnum<=endnum){
            System.out.println(stnum);
            stnum++;
            printNumber1(stnum, endnum);
        }
    }
}

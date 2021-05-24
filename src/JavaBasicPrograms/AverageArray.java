package JavaBasicPrograms;

import com.google.common.math.DoubleMath;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

    /** Calculate average of array using:
     * simple loop
     * Java 8
     * Google Guava library*/

    public static void main(String[] args) {

        int num[] = {1,2,3,4,5,6};
        double total = 0;

        for (int e : num){
            total = total + e;
        }

        System.out.println("total: " + total); //21
        System.out.println("avg is: " + (total / num.length)); //3.5


        // Java 8
        OptionalDouble avg = Arrays.stream(num).average();
        System.out.println(avg.getAsDouble()); //3.5

        //Google Guava:
        double avg1 = DoubleMath.mean(num);
        System.out.println(avg1); //3.5

    }


}

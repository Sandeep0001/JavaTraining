package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatNumberCount {

    //1221 --> 1:2   2:2

    public static void getDigitCount(long number){

        if (String.valueOf(number).length() == 1){
            System.out.println(number + ":" + 1);
            return;
        }

        HashMap<Long, Integer> digitMap = new HashMap<>();

        while (number!=0){

            long lastDigit = number%10;
            if (digitMap.containsKey(lastDigit)){
                digitMap.put(lastDigit, digitMap.get(lastDigit)+1);
            }else {
                digitMap.put(lastDigit, 1);
            }

            number = number / 10;
        }

        Set<Long> keys = digitMap.keySet();
        for (Long key : keys){
            System.out.println( key + ":" + digitMap.get(key));
        }
    }

    public static void  getDigitCountUsingStreams(long number){

        if (number<0)
            number = number*-1;

        Long.toString(number).chars().boxed()
                .collect(Collectors.groupingBy(x -> Character.getNumericValue(x), Collectors.counting()))
                .forEach((x,y) -> System.out.println(x + ":" + y));
    }


    public static void main(String[] args) {

        getDigitCount(12111);
        /**
         * 1:4
         * 2:1 */
        System.out.println("--------------------------------");
        getDigitCount(100);
        /**
         * 0:2
         * 1:1 */

        getDigitCount(0); //0:1
        getDigitCount(-1); //-1:1

        System.out.println("---------------------------------------");
        getDigitCountUsingStreams(-4565566);

    }


}

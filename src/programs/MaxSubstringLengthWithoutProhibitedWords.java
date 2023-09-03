package programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxSubstringLengthWithoutProhibitedWords {

    public static void printMaxLengthOfSubstringWithoutProhibitedWords(String input, String[] prohibitedWords){
        String[] inputArray = input.split("(?=[A-Z])");
        Map<String, Integer> lengthMap = new HashMap<>();
        int i=0;
        int j=0;
        int inputArrayLength = inputArray.length;
        String maxSubstring = inputArray[0];

        while (j<inputArrayLength){
            if (!isProhibited(maxSubstring, prohibitedWords)){
                lengthMap.put(maxSubstring, maxSubstring.length());
                j += 1;
                if (j<inputArrayLength) {
                    maxSubstring = maxSubstring + inputArray[j];
                }
            } else {
                i += j + 1;
                j = i;
                maxSubstring = inputArray[i];
            }
        }
        System.out.println(lengthMap);
        System.out.println(Collections.max(lengthMap.values()));
    }

    public static boolean isProhibited(String word, String[] prohibitedWords){
        for (String prohibited : prohibitedWords){
            if (word.toLowerCase().contains(prohibited.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        printMaxLengthOfSubstringWithoutProhibitedWords("FastDeliveryOkayProduct", new String[]{"yo", "eli", "eryok"});
    }
}

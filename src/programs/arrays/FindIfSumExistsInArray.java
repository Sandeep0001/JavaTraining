package programs.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindIfSumExistsInArray {

    public static boolean hasSum(int[] arr, int expectedSum){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            if (set.contains(expectedSum - i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static boolean hasSumUsingStreams(int[] arr, int expectedSum){
        return Arrays.stream(arr).anyMatch(num -> Arrays.stream(arr).anyMatch(otherNum -> num + otherNum == expectedSum));
    }

    public static boolean hasSumUsingHashMap(int[] arr, int expectedSum){
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int n : arr){
            int key = expectedSum - n;
            if (map.containsKey(key)){
                return true;
            }
            map.put(n, true);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(hasSum(new int[]{2,3,4,5,6,7,8,9}, 16)); //true
        System.out.println(hasSumUsingStreams(new int[]{2,3,4,5,6,7,8,9}, 16)); //true
        System.out.println(hasSumUsingHashMap(new int[]{2,3,4,5,6,7,8,9}, 16)); //true
    }
}

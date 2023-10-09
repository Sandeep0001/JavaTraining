package programs;

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

    public static void main(String[] args){
        System.out.println(hasSum(new int[]{2,3,4,5,6,7,8,9}, 16)); //true
    }
}

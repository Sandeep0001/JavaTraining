package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FindMaxInSubArray {
    /*from given array find max number from subarray  of size k
      {2,5,10,2,3,25,90,2} and k=3
      {2,5,10}{5,10,2}{10,2,3}{2,3,25} etc
      {10, 10, 10 ,25,90,90}*/

    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr = {2, 5, 10, 2, 3, 25, 90, 2};
        printMaxNumInSubArray(arr, 3);
        printMaxOfSubArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
    }

    //Brute force
    public static void printMaxNumInSubArray(int[] arr, int subArray) {
        int n = arr.length;

        if (n < subArray) {
            System.out.println("Reached the end of an array or the length of an array is lessthan given subarray");
        }

        for (int i = 0; i <= n - subArray; i++) {
            int temp = 0;
            for (int j = i; j < subArray + i; j++) {
                if (temp < arr[j]) {
                    temp = arr[j];
                }
            }
            System.out.println(temp);
        }
    }

    //using collections
    public static void printMaxOfSubArray(int[] arr, int subArrayLength) {
        int index = 0;
        List<Integer> maxList = new ArrayList<>();
        int iterationCount = 1;
        for (int i : arr) {
            if (arr.length < subArrayLength) {
                throw new RuntimeException("Given array size is less than subArray");
            } else {
                maxList.add(arr[index]);
                iterationCount++;
                index++;
                if (iterationCount > subArrayLength) {
                    iterationCount--;
                    Integer max = maxList.stream().mapToInt(e -> e).max().orElseThrow(NoSuchElementException::new);
                    System.out.print(max + " ");
                    System.out.println(maxList);
                    maxList.remove(0);
                }
            }
        }
    }
}


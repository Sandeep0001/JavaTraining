package programs.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class FindMaxInSubArray {
    /*from given array find max number from subarray  of size k
      {2,5,10,2,3,25,90,2} and k=3
      {2,5,10}{5,10,2}{10,2,3}{2,3,25} etc
      {10, 10, 10 ,25,90,90}*/

    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 2, 3, 25, 90, 2};
        printMaxNumInSubArray(arr, 3); //10 10 10 25 90 90
        printMaxFromSubArray(arr, 3); //10 10 10 25 90 90
        printMaxOfSubArray(new int[]{1, 12, 3, 4, 89, 6, 7, 3, 0}, 3);
    }

    public static void printMaxFromSubArray(int[] arr, int subArray) {
        List<Integer> intList = new ArrayList<>();
        int head = 0;

        for (int i : arr) {
            intList.add(i);
        }

        while (subArray <= intList.size()) {
            List<Integer> sublist = intList.subList(head, subArray);
            System.out.print(Collections.max(sublist) + " ");
            head++;
            subArray++;
        }
        System.out.println();
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
            System.out.print(temp+" ");
        }
        System.out.println();
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


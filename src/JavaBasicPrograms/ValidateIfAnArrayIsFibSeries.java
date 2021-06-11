package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.List;

//WAP to find if given array contains sum of fib or not

public class ValidateIfAnArrayIsFibSeries {
    static List<Integer> fibList;


    public static void main(String[] args) {

        validateIfFibSeriesExist(new int[] {2,3,7,11});
        validateIfFibSeriesExist(new int[] {1,2,3});

    }

    public static void validateIfFibSeriesExist(int[] arr){

        findFib(15);
        int sum = 0;

        for (int a : arr){

            if (fibList.contains(a)){
                sum += a;
            }
        }

        if (fibList.contains(sum)){
            System.out.println("Array contains fib series");
        }else {
            System.out.println("Array does not contain fib sum series");
        }
    }

    public static void findFib(int n){

        int i = 0;
        int j = 1;
        int sum;

        fibList = new ArrayList<>();

        for(int k = 0;k<n;k++){
            fibList.add(i);

            sum = i + j;
            i = j;
            j = sum;
        }
    }

}

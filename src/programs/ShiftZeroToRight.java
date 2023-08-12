package programs;

import java.util.Arrays;

public class ShiftZeroToRight {


    public static int[] shiftZeroToRight(int[] a){

        if (a.length == 1){
            return a;
        }

        int count =0;
        int[] newArray = new int[a.length];


        for (int number : a){
            if (number != 0){
                newArray[count] = number;
                count++;
            }
        }
        return newArray;

    }

    public static int[] shiftZeroToLeft(int[] a){

        if (a.length == 1){
            return a;
        }

        int count = a.length-1;
        int[] newArray = new int[a.length];

        for(int number :  a){
            if (number != 0){
                newArray[count] = number;
                count--;
            }
        }
        return newArray;


    }

    public static void main(String[] args) {

        //test cases
        int[] i = new int[] {1,0,2,0,3,0,0,0};
        System.out.println(Arrays.toString(shiftZeroToRight(i))); //[1, 2, 3, 0, 0, 0, 0, 0]

        /*Arrays.sort(i);
        System.out.println(Arrays.toString(i));//[0, 0, 0, 0, 0, 1, 2, 3]*/ //not a good approach

        i = new int[] {0,1,0,2,0,3,0,0,0};
        System.out.println(Arrays.toString(shiftZeroToRight(i))); //[1, 2, 3, 0, 0, 0, 0, 0,0]


        i = new int[] {1,2,3,0};
        System.out.println(Arrays.toString(shiftZeroToRight(i))); //[1, 2, 3, 0]

        i = new int[] {1,2,3};
        System.out.println(Arrays.toString(shiftZeroToRight(i))); //[1, 2, 3]

        i = new int[] {0,0,0};
        System.out.println(Arrays.toString(shiftZeroToRight(i))); //[0, 0, 0]

        i = new int[] {1};
        System.out.println(Arrays.toString(shiftZeroToRight(i))); //[1]


        //Shift zero to left
        i = new int[] {1,0,2,0,3,0,0,0};
        System.out.println(Arrays.toString(shiftZeroToLeft(i))); //[0, 0, 0, 0, 0, 3, 2, 1]

    }

}

package datastrutures.timecomplexity;

import java.util.HashMap;
import java.util.Map;

public class TCBigO {

    public static void main(String[] args) {

        int n =1; //O(1) --> as it is executing only once
        System.out.println(n); // 1


        //odd/even number -> O(1)
        int num=20; //it executes once so time complexity is O(1)
        if (num%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


        //hashmap and fetch the data from the map : look up hashmap
        Map<String , Integer> studentMarks = new HashMap<>();
        studentMarks.put("Tom", 98);
        studentMarks.put("peter", 88);
        studentMarks.put("steve", 200);

        System.out.println(studentMarks.get("Tom")); //O(1)



        //O(n):
        //1 to 10 or 1000 or 100000

        int n1 =10;
        for(int i=1;i<=n1;i++){
            System.out.println(i);
        }
        //1 + n + n + n --> 1 + 3n ----> if we ignore constants then we get --> 3n --> n --> O(n)


        //WAP to find the largest number on an unsorted array
        int arr[] = {2,32,1,433,56,65,45};
        int maxNum=0; //1

        for (int i=0; i<arr.length;i++){ //n
            if(maxNum<arr[i]){
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum); //1
        //1 + n + 1 ==> 2 + n --> O(n)


        //linear equation: n+1 or 2n+1 or 3n+1 or n


        //O(n^2):
        //this is for quadratic equation: n^2+n+1 or 2n^2+2n+1

        //00 01 02
        //10 11 12
        //20 21 22

        for (int m=0;m<=3;m++){ // 1 + m + m ==> 1+2m
            for (int p=0;p<=3;p++){//1+2p
                System.out.print(m + "" + p + " ");
            }
            System.out.println();
        }

        //(1+2m)(1+3m) --> 1+3m+2m+6m^2 --> 1+5m+6m^2 --> 5m+6m^2 --> m^2+m --> m^2 --> O(n^2)

        //WAP to get the duplicate number from an array:
        int dup[] = {2,3,1,45,65,45,3,45,3,67,67};

        for(int i=0;i<dup.length;i++){//n
            for (int j=0;j<dup.length;j++){//n+n --> 2n
                if (i==j) continue;
                if (dup[i] == dup[j]){
                    System.out.println(dup[i] + " is duplicate");
                }
            }
        }
        //n * 2n --> O(n^2)


        for(int i=0;i<dup.length;i++){//n
            for (int j=0;j<dup.length;j++){//n --> n
                for(int k=0;k<dup.length;k++){//n

                }
            }
        }
        //n * n* n --> n^3 --> O(n^3)


    }

}

package datastrutures.timecomplexity;

public class BinarySearch {

    //best case: O(1)
    //worst and average case: O(Logk N) (base is k)


    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8,9};
        //Arrays.sort(arr);
        int n =arr.length;
        int x = 4;

        int result = binarySearch(arr, x, 0, n-1);
        if (result==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index : " + result);
        }

    }

    public static int binarySearch(int arr[], int x, int low, int high){

        while(low<=high){
            int mid = low + (high - low)/2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid]<x){
                low=mid+1;
            }else{
                high = mid-1;
            }


        }
        return -1;


    }


}

package JavaBasicPrograms;

public class MissingElement {

    //Find out missing element in an integer array

    public static void main(String[] args) {

        //1 2 3 5 7 8 ... 100

        int num[] = {1,2,3,5};
        System.out.println(findMissingNumber(num, 5)); //4


    }

    public static int findMissingNumber(int num[], int totalCount){

        int expSum = totalCount * ((totalCount+1)/2);
        int actualSum = 0;

        for (int i : num){
            actualSum += i;
        }

        return expSum-actualSum;

    }

}

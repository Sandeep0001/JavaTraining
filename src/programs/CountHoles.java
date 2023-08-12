package programs;

public class CountHoles {

    static int hole[] = {1,0,0,0,1,0,1,0,2,1};

    static int countHoles(int num){

        int holes = 0;

        while (num > 0){

            int d = num%10;
            holes += hole[d];
            num /= 10;

        }
        return holes;


    }

    public static void main(String[] args) {

        int sum = 6457819;
        System.out.println(countHoles(sum)); //5
    }

}

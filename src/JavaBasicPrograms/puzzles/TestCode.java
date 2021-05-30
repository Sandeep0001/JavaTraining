package JavaBasicPrograms.puzzles;

public class TestCode {

    /**
     * what will be the output when you print this?
     * (byte) + (char) - (int) + (long) -1
     * */

    public static void main(String[] args) {

        int i = (byte) + (char) - (int) + (long) -1;
        System.out.println(i); //1 --> it casts long of -1 and execution starts right to left and hence the output 1

        int j = (int) + (long) -1;
        System.out.println(j);//-1

        int k = (char) 1;
        System.out.println(k); //1

        int m = (byte) 1;
        System.out.println(m); //1



    }

}

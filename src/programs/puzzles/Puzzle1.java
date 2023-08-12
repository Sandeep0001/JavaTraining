package programs.puzzles;

public class Puzzle1 {

    public static void main(String[] args) {

        int i = 5;

        int result = ++i + ++i + i++;

        System.out.println(i); //8

        System.out.println(result); //20

    }

}

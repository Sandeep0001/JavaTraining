package programs.puzzles;

public class Puzzle4 {

    public static void main(String [] args)
    {
        int result = 0;

        Boolean b1 = new Boolean("TRUE"); //true
        Boolean b2 = new Boolean("true"); //true
        Boolean b3 = new Boolean("tRuE"); //true
        Boolean b4 = new Boolean("false"); //false

        if (b1 == b2)result = 1; //
        if (b1.equals(b2))result = result + 10;
        if (b2 == b4)result = result + 100;
        if (b2.equals(b4))result = result + 1000;
        if (b2.equals(b3))result = result + 10000;
        System.out.println(result); //10010
    }

}

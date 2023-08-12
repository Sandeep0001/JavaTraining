package programs.puzzles;

public class Puzzle6 {

    public static void main(String[] args)
    {
        String s1 = "xyz";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1==s2)); //xyzd xyz false

        /** StringBuffer in java is used to create modifiable String objects.
         * This means that we can use StringBuffer to append, reverse, replace,
         * concatenate and manipulate Strings or sequence of characters. */

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); //abcd abcd true
    }

}

package programs.puzzles;

public class Puzzle11 {


    /*If your program doesn't contain the main method, then you will get an error “main method not found in the class”. It will give an error (byte code verification error because in it's byte code, main is not there) not an exception because the program has not run yet.*/


    public static void foo( boolean a, boolean b)
    {
        if( a )
        {
            System.out.println("A");
        }
        else if(a && b)
        {
            System.out.println( "A && B");
        }
        else
        {
            if ( !b )
            {
                System.out.println( "notB") ;
            }
            else
            {
                System.out.println( "ELSE" ) ;
            }
        }
    }

    /*public static void main(String[] args) {
        foo(true, false);
    }*/
}

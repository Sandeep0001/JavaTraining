package JavaBasicPrograms.puzzles;

public class Puzzle12 extends Thread{

    final StringBuffer str1 = new StringBuffer();
    final StringBuffer str2 = new StringBuffer();

    public static void main(String args[])
    {
        final Puzzle12 obj = new Puzzle12();

        new Thread()
        {
            public void run()
            {
                synchronized(this)
                {
                    obj.str1.append("1");
                    obj.str2.append("A");
                    System.out.println(obj.str1);
                    System.out.println(obj.str2);
                }
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                synchronized(this)
                {
                    obj.str1.append("2");
                    obj.str2.append("B");
                    System.out.println(obj.str2);
                    System.out.println(obj.str1);
                }
            }
        }.start();

    }
}

/** output is
 * 1
 * A
 * AB
 * 12
 *
 * */

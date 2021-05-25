package JavaBasicPrograms.puzzles;

class MTClass extends Thread
{
    public void run()
    {
        try
        {
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}


class Main  //if we declare public class then we get error to define class outside
{
    public static void main(String[] args)
    {
        for (int i=0; i<=3; i++)
        {
            MTClass object = new MTClass();
            object.start();
        }
    }
}

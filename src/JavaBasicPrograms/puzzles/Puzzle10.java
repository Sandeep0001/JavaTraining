package JavaBasicPrograms.puzzles;

class MyThread extends Thread
{
    MyThread() {}
    MyThread(Runnable r) {super(r); }
    public void run()
    {
        System.out.print("Inside Thread ");
    }
}
class RunnableDemo implements Runnable
{
    public void run()
    {
        System.out.print(" Inside Runnable");
    }
}
class ThreadDemo
{
    public static void main(String[] args)
    {
        new MyThread().start();
        new MyThread(new RunnableDemo()).start();
    }
}

//output is Inside Thread Inside Thread

package designpatterns.singletonpattern;

public class TestBrowser {
    public static void main(String[] args) {
        //Browser br = new Browser(); //cannot create object as Browser constructor is private

        //Browser.getInstance().displayMessage();

        Runnable task = () -> Browser.getInstance().displayMessage();

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        Thread thread5 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        //wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /* output
     * Browser info
     * Browser info
     * Browser info
     * Browser info
     * Browser info
     * */
}

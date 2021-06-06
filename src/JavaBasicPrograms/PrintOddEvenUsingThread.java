package JavaBasicPrograms;

public class PrintOddEvenUsingThread {

    int counter = 1;

    static int n;

    public void printEvenNumber(){

        synchronized (this){

            while (counter < n){

                while(counter %2 ==0) {

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");

                counter++;
                notify();
            }
        }
    }

    public void printOddNumber(){

        synchronized (this){
            while (counter < n){
                while(counter%2 == 1){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");

                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {

        n = 10;

        PrintOddEvenUsingThread obj = new PrintOddEvenUsingThread();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printOddNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printEvenNumber();
            }
        });

        t1.start();
        t2.start();

    }

}

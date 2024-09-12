package designpatterns.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BrowserReadResolve {
    public static void main(String[] args) {
        try{
            Browser instance1 = Browser.getInstance();

            String path = "src/designpatterns/singletonpattern/browser.json";
            //Serialize the browser instance
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
            out.writeObject(instance1);
            out.close();

            //De-Serialize the browser instance
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
            Browser instance2 = (Browser) in.readObject();
            in.close();

            System.out.println("Instance1 hash code: " + instance1.hashCode()); //Instance1 hash code: 1160264930
            System.out.println("Instance2 hash code: " + instance2.hashCode()); ////Instance2 hash code: 1160264930

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

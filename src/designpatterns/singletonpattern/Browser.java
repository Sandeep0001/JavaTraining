package designpatterns.singletonpattern;

import java.io.Serial;
import java.io.Serializable;

public class Browser implements Serializable, Cloneable {
    //we use serializable interface whenever we want to use singleton in pojo
    //Implement cloneable interface to avoid violation of singleton using clone to create multiple objects / instances for singleton

    //1. Private static instance of the class
    private volatile static Browser browser; // Volatile keyword is a modifier that ensures that an attribute's value is always the same when read from all threads

    //2. Private constructor to prevent/avoid instantiation/object
    private Browser() {
        if (browser != null){ //handling reflection attack to avoid additional object creation
            throw new IllegalArgumentException("object already exists");
        }
    }

    //3. Public static getInstance method to provide access to the instance/object
    public static Browser getInstance() { //synchronised : because to provide thread safety in case of multi thread execution
        if(browser==null){
            synchronized (Browser.class){
                if(browser==null){
                    browser = new Browser();
                }
            }
        }
        return browser;
    }

    //Individual public method of the class
    public void displayMessage(){
        System.out.println("Browser info");
    }

    //Add readResolve() -- which will be called during De-Serialization process -- this will return class instance
    @Serial
    protected Object readResolve(){ //adding readresolve() method to avoid violation of singleton process during de-serialization
        return getInstance();
    }

    //Overriding clone method of cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance cannot be cloned");
    }
}

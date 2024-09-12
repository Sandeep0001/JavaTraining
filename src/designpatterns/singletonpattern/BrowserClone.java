package designpatterns.singletonpattern;

public class BrowserClone {
    public static void main(String[] args) {
        Browser instance1 = Browser.getInstance();

        try {
            Browser instance2 = (Browser) instance1.clone();
            System.out.println(instance2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /*output
     * Exception in thread "main" java.lang.RuntimeException: java.lang.CloneNotSupportedException: Singleton instance cannot be cloned
     * 	at designpatterns.singletonpattern.BrowserClone.main(BrowserClone.java:10)
     * Caused by: java.lang.CloneNotSupportedException: Singleton instance cannot be cloned
     * 	at designpatterns.singletonpattern.Browser.clone(Browser.java:44)
     * 	at designpatterns.singletonpattern.BrowserClone.main(BrowserClone.java:8)*/
}

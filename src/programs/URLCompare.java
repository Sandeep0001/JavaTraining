package programs;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

    //what will be the output when you compare site URL with its ip address?

    public static void main(String[] args) throws MalformedURLException {

        //abc.com --> 89.90.98.101

        System.out.println(new URL("https://app.hubspot.com").equals(new URL("https://104.19.154.83"))); // true

    }
}

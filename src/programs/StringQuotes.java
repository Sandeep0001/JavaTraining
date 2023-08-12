package programs;

public class StringQuotes {

    /**
     *   /"Hello"/
     *   /'Hello'/
     *   "Hello"
     *   I love "Java" and "Programming"
     *   'I love "Java" and "Programming"'
     *
     * */


    public static void main(String[] args) {

        System.out.println("/\"Hello\"/");
        System.out.println("/'Hello'/");
        System.out.println("\"Hello\"");
        System.out.println("'I love \"Java\" and \"Programming\"'");


        System.out.println(getXpath("Sandeep")); ////input[@id='Sandeep']

    }

    public static String getXpath(String name){

        String xpath = "//input[@id='"+name+"']";

        return xpath;

    }


}

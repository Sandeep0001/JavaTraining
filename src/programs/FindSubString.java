package programs;

public class FindSubString {

    //Check subString is present in a given string

    public static boolean isSubstring(String main, String sub){

        return main.matches("(.*)"+sub+"(.*)");
    }

    public static boolean isSubstring1(String main, String sub){

        return main.indexOf(sub)!=-1;
    }

    public static boolean isSubstring2(String main, String sub){

        return main.matches("(.*)"+sub+"(.*)");
    }

    public static void main(String[] args) {

        System.out.println(isSubstring(" Hi Welcome to Java programming", "Java")); //true
        System.out.println(isSubstring1("Hi Welcome to Java programming", "Programming")); //false
        System.out.println(isSubstring2(" Hi Welcome to Java $$", "$$")); //true
        System.out.println(isSubstring("automation", "auto")); //true

        System.out.println(isSubstring("Hi Hello", " ")); //true



    }

}

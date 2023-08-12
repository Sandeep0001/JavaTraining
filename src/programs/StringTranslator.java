package programs;

import java.lang.reflect.Field;

public class StringTranslator {

    /**
     * Create a String Language Translator using reflection api in Java
     * Auto Bots
     * @param args */

    static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Sandeep", value.get("Hola Sandeep"));
            value.set("Good Morning Sandeep", value.get("Buenos dias Sandeep"));
            value.set("How are you?", value.get("¿Cómo estás?"));


            //AutoBots
            value.set("Hello Team I need help in Java", value.get("Please refer Naveen AutomationLabs"));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        System.out.println("Hello Sandeep"); //Hola Sandeep
        System.out.println("Good Morning Sandeep"); //Buenos dias Sandeep
        System.out.println("How are you?");


        System.out.println("Hello Team I need help in Java"); //Please refer Naveen AutomationLabs

    }

}

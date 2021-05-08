package JavaBasics;

public class StringObject {

    public static void main(String[] args){
        // How many  String objects will be created

        String s1 = new String("New world");
        String s2 = new String ("New world"); //Three objects will be created i.e one String constant poll and two objets in heap memory

        //--------------------------------------------------------------------------------------------------

        String s3 = "Hello world";
        String s4 = "Hello world";
        String s5 = "Hello world";


        String n1 = new String("Hello world");
        String n2 = new String("Hello world"); //Three objects will be created

        System.out.println(s1==s2); //true
        System.out.println(s2==s3); //true
        System.out.println(s1==s3); //true

        System.out.println(n1==n2); //false
        System.out.println(s1==n1); //false

        //---------------------------------------------------------------------------------------------

        String s6 = "Hello"; // one object is created here i.e in SCP (String constant pool)

        String n3 = new String("Boom"); // Two objects will be created because i.e one in SCP and other separate object will be created heap memory
    }

}

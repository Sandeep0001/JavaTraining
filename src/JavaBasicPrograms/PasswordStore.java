package JavaBasicPrograms;

import java.util.Arrays;

public class PasswordStore {

    //Why password should be stored in char array char[] instead of String?

    public static void main(String[] args) {

        String pwd = "Sandeep123";
        System.out.println("password is :" + pwd); //Sandeep123

        char c[] = new char[]{'S','a','n','d','e','e','p','1','2','3'};
        System.out.println("password c :" +c); //[C@6d6f6e28


        Arrays.fill(c, '*');
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]);//**********
        }

    }


}

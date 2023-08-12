package programs;

public class DivideByZero {

    public static void main(String[] args){
        /*What will be the output when we divide a number by zer0?
        Number = Integer, double, float
        */

        //System.out.println(9/0); // arithmetic exception error
        System.out.println(9.0/0); //Infinity
        System.out.println(12.33f/0); //Infinity
        System.out.println(10/0.0); //Infinity
        System.out.println(19.99d/0); //Infinity
        //System.out.println(0/0); //arithmetic exception
        System.out.println(0.0/0); //Nan
        System.out.println(0.0/0.0); //Nan
        System.out.println(12.21/0.0); //Infinity

    }
}

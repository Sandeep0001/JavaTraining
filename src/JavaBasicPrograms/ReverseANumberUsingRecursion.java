package JavaBasicPrograms;

public class ReverseANumberUsingRecursion {

    //Reverse a number using recursion
    public static void rev(long number){

        if (number<10){
            System.out.println(number);
            return;
        }else {
            System.out.print(number%10);
            rev(number/10);
        }
    }

    public static void main(String[] args) {
        rev(123); //321
        rev(12345); //54321
        rev(123982347988808423l); //324808889743289321
        rev(100); //001
        rev(001); //1

        //without recursion
        /*int num=456;

        while (num>0){
            int rev=num%10;
            System.out.print(rev); //654
            num=num/10;
        }*/
    }
}

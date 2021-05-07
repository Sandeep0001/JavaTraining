package JavaBasicPrograms;

public class Print1to100NumbersWithoutUsingNumbersInCode {

    public static void main(String[] args){
        int one = 'A'/'A';
        String s1 = "asdfghjklp";

        for(int i=one;i<=(s1.length() * s1.length());i++){
            System.out.println(i);
        }

        //using ascii values a=97, b=98, c=99, d=100
        for(int i=one;i<='d';i+=one){
            System.out.println(i);
        }
    }
}

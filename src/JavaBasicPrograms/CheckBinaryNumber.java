package JavaBasicPrograms;


//Check given number is Binary or not

public class CheckBinaryNumber {

    public static void isBinaryNumber(int number) {
        boolean isBinary = true;

        int copyNumber = number;
        while (copyNumber != 0) {
            int rem = copyNumber % 10;
            if (rem > 1) {
                isBinary = false;
                break;
            } else {
                copyNumber = copyNumber / 10;
            }
        }
        if (isBinary) {
            System.out.println(number + " is a binary number");
        } else {
            System.out.println(number + " is not a binary number");
        }
    }


    public static void isBinaryUsingRegex(int number) {
        if (String.valueOf(number).matches("[0-1]+")) {
            System.out.println(number + " is a binary number");
        } else {
            System.out.println(number + " is not a binary number");
        }
    }


    public static void isBinNum(int number){

        try{
            Integer.parseInt(String.valueOf(number), 2);
            System.out.println(number + " is a binary number");
        }catch (Exception e){
            System.out.println(number + " is not a binary number");
        }
    }


    public static void main(String[] args) {

        isBinaryNumber(1011); // 1011 is a binary number
        isBinaryNumber(2066); // 2066 is not a binary number

        System.out.println("------------------------------------------------------");
        isBinaryUsingRegex(1011); //1011 is a binary number
        isBinaryUsingRegex(1011111111);


        System.out.println("-------------------------------------------------------");
        isBinNum(1000); // 1000 is a binary number
        isBinNum(2); // 2 is not a binary number

    }


}

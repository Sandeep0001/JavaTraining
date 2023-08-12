package programs;


//check given number is valid or not

//check given phone number is valid or not -- 10 digits
//check given CC number is valid or not -- 16 digits
public class IsNumber {

    public static boolean isCorrectPhoneNumber(String number){
        //return number.matches("[0-9]{10}");
        return number.matches("\\d{10}");
    }

    public static boolean isCorrectNnumber(String number){
        return number.matches("^(-?\\d+\\.)?-?\\d+$");
    }

    public static boolean isNumber(String number){
        try {
            Long.parseLong(number);
            System.out.println("It's a valid number " + number);
        }
        catch (NumberFormatException e){
            System.out.println("Not a valid number " + number);
            return false;
        }
        return true;
    }


    public static boolean isValidPhoneNumber(String number){

        if (number.length() == 10 && isNumber(number)){
            System.out.println("Valid phone number " + number);
            return true;
        }
        System.out.println("Not a valid phone number " + number);
        return false;
    }

    public static boolean isValidCCNumber(String number){

        if (number.length() == 16 && isNumber(number)){
            System.out.println("Valid CC number " + number);
            return true;
        }
        System.out.println("Not a valid CC number " + number);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("123a"));
        System.out.println(isValidPhoneNumber("9876543210"));
        System.out.println(isCorrectPhoneNumber("9876543210")); //true
        System.out.println(isCorrectPhoneNumber("987654321012")); //false
        System.out.println(isValidCCNumber("9876543210123456"));

        System.out.println(isCorrectNnumber("100"));//true
        System.out.println(isCorrectNnumber("100.2"));//true
        System.out.println(isCorrectNnumber("-100.2"));//true
        System.out.println(isCorrectNnumber("-100A"));//false
    }


}

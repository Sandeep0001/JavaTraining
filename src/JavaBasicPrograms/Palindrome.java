package JavaBasicPrograms;

public class Palindrome {

    public static void main(String[] args) {

        validateStringIfPalindromeOrnot("Radar");
        validateStringIfPalindromeOrnot("abc");
        validateStringIfPalindromeOrnot("252");
    }


    public static void validateStringIfPalindromeOrnot(String str){

        String reverse = "";

        for (int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        if (str.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println("Given String is palindrome");
        }else {
            System.out.println("It is not palindrome");
        }

    }
}

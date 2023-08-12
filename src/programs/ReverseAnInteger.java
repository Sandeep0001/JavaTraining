package programs;

public class ReverseAnInteger {
    public static void main(String[] args) {
        reverse(1234);
        reverse(-1234);
    }

    public static void reverse(int n){
        String str = String.valueOf(n);
        String reversedString = "";
        if (!Character.isDigit(str.charAt(0)))
            reversedString = String.valueOf(str.charAt(0));
        for (int i=str.length()-1;i>=0;i--){
            if (Character.isDigit(str.charAt(i)))
                reversedString += str.charAt(i);
        }
        System.out.println("reversed value is " + reversedString);
    }
}

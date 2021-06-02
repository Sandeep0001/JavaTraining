package JavaBasicPrograms;

public class ReverseStringIfVowel {


    public static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static void reverseVowel(String str){

        int j=0;
        char c[] = str.toCharArray();
        String vowel = "";


        for(int i=0;i<c.length;i++){
            if (isVowel(c[i])){
                j++;
                vowel += c[i];
            }
        }

        for(int i=0;i<c.length;i++){
            if (isVowel(c[i])){
                c[i] = vowel.charAt(--j);
            }
        }

        System.out.println(String.valueOf(c));
    }


    public static void main(String[] args) {
        reverseVowel("Hello");
    }


}

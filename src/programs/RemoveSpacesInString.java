package programs;

public class RemoveSpacesInString {

    // Function to remove all
    // spaces from a given string
    static String removeSpace(String str) {
        str = str.replaceAll("\\s", "");
        return str;
    }

    // Driver Code
    public static void main(String args[]) {
        String str = "g eeks for ge eeks ";
        System.out.println(removeSpace(str));
    }
}

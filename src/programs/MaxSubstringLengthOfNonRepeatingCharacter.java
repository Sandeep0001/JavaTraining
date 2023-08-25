package programs;

import java.util.HashSet;
import java.util.Set;

public class MaxSubstringLengthOfNonRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int i = 0, j = 0; // i marks the start of the substring, j marks the end

        while (i < n && j < n) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcdbb"; // 4
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}

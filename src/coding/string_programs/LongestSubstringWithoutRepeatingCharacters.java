package coding.string_programs;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static String longestSubstring(String input) {
        int left = 0;
        int maxLength = 0;
        String result = "";
        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < input.length(); right++) {
            char ch = input.charAt(right);
            while (seen.contains(ch)) {
                seen.remove(input.charAt(left));
                left++;
            }
            seen.add(ch);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                result = input.substring(left, right + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring: " + longestSubstring(input));
    }
}

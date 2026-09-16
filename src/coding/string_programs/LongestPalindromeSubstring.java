package coding.string_programs;

public class LongestPalindromeSubstring {
    public static String longestPalindrome(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        String longest = input.substring(0, 1);
        for (int i = 0; i < input.length(); i++) {
            String odd = expandAroundCenter(input, i, i);
            String even = expandAroundCenter(input, i, i + 1);
            if (odd.length() > longest.length()) {
                longest = odd;
            }
            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest palindrome: " + longestPalindrome(input));
    }
}

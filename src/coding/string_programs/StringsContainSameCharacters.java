package coding.string_programs;

import java.util.HashMap;
import java.util.Map;

public class StringsContainSameCharacters {
    public static boolean sameCharacters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!freq.containsKey(ch)) {
                return false;
            }
            int count = freq.get(ch) - 1;
            if (count < 0) {
                return false;
            }
            freq.put(ch, count);
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        System.out.println("Same characters: " + sameCharacters(a, b));
    }
}

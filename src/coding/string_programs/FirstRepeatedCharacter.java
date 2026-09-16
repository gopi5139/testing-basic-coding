package coding.string_programs;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String text = "abca";
        Set<Character> seen = new HashSet<>();
        for (char ch : text.toCharArray()) {
            if (!seen.add(ch)) {
                System.out.println("First repeated character: " + ch);
                return;
            }
        }
        System.out.println("No repeated character found");
    }
}

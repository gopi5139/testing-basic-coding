package coding.string_programs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String text = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char ch : text.toCharArray()) {
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }
        System.out.println("Duplicate characters: " + duplicates);
    }
}

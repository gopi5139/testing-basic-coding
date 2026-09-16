package coding.string_programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersFromString {
    public static void main(String[] args) {
        String text = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : text.toCharArray()) {
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        System.out.println("Unique string: " + result);
    }
}

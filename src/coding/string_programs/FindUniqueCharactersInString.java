package coding.string_programs;

import java.util.LinkedHashSet;

public class FindUniqueCharactersInString {
    public static void main(String[] args) {
        String text = "programming";
        LinkedHashSet<Character> uniques = new LinkedHashSet<>();
        for (char ch : text.toCharArray()) {
            uniques.add(ch);
        }
        System.out.println("Unique characters: " + uniques);
    }
}

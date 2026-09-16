package coding.string_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromSentence {
    public static String removeDuplicateWords(String sentence) {
        String[] words = sentence.split("\s+");
        Set<String> unique = new LinkedHashSet<>();

        for (String word : words) {
            unique.add(word);
        }

        StringBuilder result = new StringBuilder();
        for (String word : unique) {
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "java is java powerful and powerful";
        System.out.println(removeDuplicateWords(sentence));
    }
}

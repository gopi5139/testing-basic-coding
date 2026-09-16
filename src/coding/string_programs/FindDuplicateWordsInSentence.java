package coding.string_programs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWordsInSentence {
    public static void findDuplicateWords(String sentence) {
        String[] words = sentence.toLowerCase().split("\s+");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                duplicates.add(word);
            }
        }

        System.out.println("Duplicate words: " + duplicates);
    }

    public static void main(String[] args) {
        String sentence = "java java is powerful and java is easy";
        findDuplicateWords(sentence);
    }
}

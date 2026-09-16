package coding.string_programs;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedWord {
    public static String findFirstRepeatedWord(String sentence) {
        String[] words = sentence.toLowerCase().split("\s+");
        Set<String> seen = new HashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                return word;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String sentence = "java is simple java is powerful";
        System.out.println("First repeated word: " + findFirstRepeatedWord(sentence));
    }
}

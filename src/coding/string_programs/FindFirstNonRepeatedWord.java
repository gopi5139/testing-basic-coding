package coding.string_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedWord {
    public static String findFirstNonRepeatedWord(String sentence) {
        Map<String, Integer> frequency = new LinkedHashMap<>();
        String[] words = sentence.toLowerCase().split("\s+");

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (String word : words) {
            if (frequency.get(word) == 1) {
                return word;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String sentence = "java is simple and java is good";
        System.out.println("First non-repeated word: " + findFirstNonRepeatedWord(sentence));
    }
}

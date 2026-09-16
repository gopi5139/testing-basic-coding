package coding.string_programs;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentlyOccurringCharacter {
    public static void main(String[] args) {
        String text = "banana";
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent character: " + mostFrequent + " (" + maxCount + ")");
    }
}

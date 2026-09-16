package coding.string_programs;

import java.util.HashMap;
import java.util.Map;

public class FindSecondMostFrequentCharacter {
    public static char findSecondMostFrequent(String input) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        char first = 0, second = 0;
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (first == 0 || entry.getValue() > frequency.get(first)) {
                second = first;
                first = entry.getKey();
            } else if (second == 0 || entry.getValue() > frequency.get(second)) {
                second = entry.getKey();
            }
        }

        return second;
    }

    public static void main(String[] args) {
        String input = "automation";
        System.out.println("Second most frequent character: " + findSecondMostFrequent(input));
    }
}

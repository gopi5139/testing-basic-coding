package coding.string_programs;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String text = "automation";
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

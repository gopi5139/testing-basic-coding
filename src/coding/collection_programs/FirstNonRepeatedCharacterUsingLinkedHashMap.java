package coding.collection_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterUsingLinkedHashMap {
    public static void main(String[] args) {
        String text = "abacdd";
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeated value");
    }
}

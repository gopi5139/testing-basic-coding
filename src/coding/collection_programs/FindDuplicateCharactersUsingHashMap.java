package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersUsingHashMap {
    public static void main(String[] args) {
        String text = "programming";
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq.entrySet().stream().filter(e -> e.getValue() > 1).toList());
    }
}

package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyUsingHashMap {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana"};
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println(freq);
    }
}

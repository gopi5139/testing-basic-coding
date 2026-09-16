package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValuesUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicates: " + freq.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList());
    }
}

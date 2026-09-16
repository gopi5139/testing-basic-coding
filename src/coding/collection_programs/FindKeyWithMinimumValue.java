package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;

public class FindKeyWithMinimumValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        Map.Entry<String, Integer> minEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                minEntry = entry;
            }
        }
        System.out.println(minEntry.getKey() + " => " + minEntry.getValue());
    }
}

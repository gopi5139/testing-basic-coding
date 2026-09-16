package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;

public class FindKeyWithMaximumValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey() + " => " + maxEntry.getValue());
    }
}

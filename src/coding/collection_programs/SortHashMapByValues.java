package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 30);
        map.put("B", 10);
        map.put("C", 20);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
        System.out.println(new TreeMap<>(map));
    }
}

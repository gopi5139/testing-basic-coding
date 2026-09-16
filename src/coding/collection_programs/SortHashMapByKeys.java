package coding.collection_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("b", 2);
        map.put("a", 1);
        map.put("c", 3);
        System.out.println(new TreeMap<>(map));
    }
}

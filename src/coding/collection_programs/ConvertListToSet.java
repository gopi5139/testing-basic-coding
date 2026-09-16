package coding.collection_programs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 4);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}

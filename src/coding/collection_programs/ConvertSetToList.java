package coding.collection_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetToList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4));
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}

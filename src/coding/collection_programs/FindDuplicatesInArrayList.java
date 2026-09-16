package coding.collection_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4));
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : list) {
            if (!seen.add(num)) duplicates.add(num);
        }
        System.out.println(duplicates);
    }
}

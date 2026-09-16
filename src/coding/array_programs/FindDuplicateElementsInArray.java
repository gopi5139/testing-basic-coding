package coding.array_programs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) duplicates.add(num);
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}

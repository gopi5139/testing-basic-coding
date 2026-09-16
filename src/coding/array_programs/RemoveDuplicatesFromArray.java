package coding.array_programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        System.out.println(Arrays.toString(set.toArray()));
    }
}

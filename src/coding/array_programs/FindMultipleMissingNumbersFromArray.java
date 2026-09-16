package coding.array_programs;

import java.util.ArrayList;
import java.util.List;

public class FindMultipleMissingNumbersFromArray {
    public static List<Integer> findMissingNumbers(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                present[num] = true;
            }
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(findMissingNumbers(arr, 6));
    }
}

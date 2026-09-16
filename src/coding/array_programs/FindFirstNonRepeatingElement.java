package coding.array_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstNonRepeatingElement {
    public static int findFirstNonRepeatingElement(int[] arr) {
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> repeated = new LinkedHashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                repeated.add(num);
            }
        }

        for (int num : arr) {
            if (!repeated.contains(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        System.out.println("First non-repeating element: " + findFirstNonRepeatingElement(arr));
    }
}

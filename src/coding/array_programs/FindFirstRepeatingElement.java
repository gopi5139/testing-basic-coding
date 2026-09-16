package coding.array_programs;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingElement {
    public static int findFirstRepeatingElement(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        System.out.println("First repeating element: " + findFirstRepeatingElement(arr));
    }
}

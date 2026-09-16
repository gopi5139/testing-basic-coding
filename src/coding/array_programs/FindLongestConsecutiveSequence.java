package coding.array_programs;

import java.util.HashSet;
import java.util.Set;

public class FindLongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int current = 1;
                while (set.contains(num + current)) {
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence: " + longestConsecutiveSequence(arr));
    }
}

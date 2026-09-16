package coding.array_programs;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElementInArray {
    public static int majorityElement(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        int majority = arr[0];
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > arr.length / 2) {
                majority = num;
                break;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 4};
        System.out.println("Majority element: " + majorityElement(arr));
    }
}

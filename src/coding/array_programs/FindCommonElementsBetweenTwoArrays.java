package coding.array_programs;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        List<Integer> common = new ArrayList<>();
        for (int num : a) {
            for (int value : b) {
                if (num == value) common.add(num);
            }
        }
        System.out.println("Common elements: " + common);
    }
}

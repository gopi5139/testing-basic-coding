package coding.array_programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindUnionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        LinkedHashSet<Integer> union = new LinkedHashSet<>();
        for (int num : a) union.add(num);
        for (int num : b) union.add(num);
        System.out.println("Union: " + Arrays.toString(union.toArray()));
    }
}

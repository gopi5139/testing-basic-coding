package coding.array_programs;

import java.util.LinkedHashSet;

public class FindUniqueElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) unique.add(num);
        System.out.println("Unique elements: " + unique);
    }
}

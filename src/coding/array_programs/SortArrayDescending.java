package coding.array_programs;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 4, 2, 3};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

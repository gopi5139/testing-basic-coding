package coding.array_programs;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 6};
        int count = 0;
        for (int num : arr) {
            if (num != 0) arr[count++] = num;
        }
        while (count < arr.length) arr[count++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

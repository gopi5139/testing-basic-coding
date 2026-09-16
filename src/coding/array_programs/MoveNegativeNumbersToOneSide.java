package coding.array_programs;

import java.util.Arrays;

public class MoveNegativeNumbersToOneSide {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

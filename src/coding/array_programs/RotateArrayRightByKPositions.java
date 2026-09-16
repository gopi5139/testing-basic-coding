package coding.array_programs;

import java.util.Arrays;

public class RotateArrayRightByKPositions {
    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateRight(arr, 2)));
    }
}

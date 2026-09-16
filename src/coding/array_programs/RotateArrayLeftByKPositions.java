package coding.array_programs;

import java.util.Arrays;

public class RotateArrayLeftByKPositions {
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateLeft(arr, 2)));
    }
}

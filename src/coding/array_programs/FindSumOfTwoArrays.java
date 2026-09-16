package coding.array_programs;

import java.util.Arrays;

public class FindSumOfTwoArrays {
    public static int[] addArrays(int[] a, int[] b) {
        int maxLength = Math.max(a.length, b.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int sum = 0;
            if (i < a.length) sum += a[i];
            if (i < b.length) sum += b[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        System.out.println(Arrays.toString(addArrays(a, b)));
    }
}

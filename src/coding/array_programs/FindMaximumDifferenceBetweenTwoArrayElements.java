package coding.array_programs;

public class FindMaximumDifferenceBetweenTwoArrayElements {
    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 10, 7};
        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                maxDiff = Math.max(maxDiff, Math.abs(arr[j] - arr[i]));
            }
        }
        System.out.println("Maximum difference: " + maxDiff);
    }
}

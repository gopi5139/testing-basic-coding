package coding.array_programs;

public class FindMinimumSubarraySum {
    public static int minSubarraySum(int[] arr) {
        int currentMin = arr[0];
        int globalMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            globalMin = Math.min(globalMin, currentMin);
        }

        return globalMin;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -1, 5};
        System.out.println("Minimum subarray sum: " + minSubarraySum(arr));
    }
}

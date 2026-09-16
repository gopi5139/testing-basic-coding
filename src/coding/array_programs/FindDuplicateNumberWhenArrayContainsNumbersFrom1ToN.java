package coding.array_programs;

public class FindDuplicateNumberWhenArrayContainsNumbersFrom1ToN {
    public static int findDuplicate(int[] arr) {
        int expectedSum = (arr.length - 1) * arr.length / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return actualSum - expectedSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println("Duplicate number: " + findDuplicate(arr));
    }
}

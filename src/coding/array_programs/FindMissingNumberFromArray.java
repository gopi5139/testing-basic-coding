package coding.array_programs;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int expectedSum = (6 * 7) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}

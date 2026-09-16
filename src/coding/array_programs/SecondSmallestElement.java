package coding.array_programs;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 10};
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second smallest: " + secondSmallest);
    }
}

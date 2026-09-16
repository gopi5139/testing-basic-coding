package coding.array_programs;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3};
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
        }
        System.out.println("Largest element: " + largest);
    }
}

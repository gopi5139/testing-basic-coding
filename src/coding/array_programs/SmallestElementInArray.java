package coding.array_programs;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3};
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) smallest = num;
        }
        System.out.println("Smallest element: " + smallest);
    }
}

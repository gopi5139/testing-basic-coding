package coding.number_programs;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int start = 1, end = 100;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from " + start + " to " + end + " is: " + sum);
    }
}

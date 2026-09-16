package coding.number_programs;

public class SumOfNumbers {
    public static void main(String[] args) {
        int start = 1, end = 100;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
    }
}

package coding.number_programs;

public class StrongNumber {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
    }
}

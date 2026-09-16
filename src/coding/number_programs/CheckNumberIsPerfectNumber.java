package coding.number_programs;

// A perfect number is a positive integer that is equal to the sum of its proper divisors.
// For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
// Another example is 28, which has proper divisors 1, 2, 4, 7, and 14, and 1 + 2 + 4 + 7 + 14 = 28.
public class CheckNumberIsPerfectNumber {
    public static void main(String[] args) {
        int number = 28; // You can change this number to test other cases
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

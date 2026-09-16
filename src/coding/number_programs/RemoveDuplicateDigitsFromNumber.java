package coding.number_programs;

public class RemoveDuplicateDigitsFromNumber {
    public static void main(String[] args) {
        int number = 122334455;
        int result = 0;
        int multiplier = 1;

        while (number > 0) {
            int digit = number % 10;
            if (!containsDigit(result, digit)) {
                result += digit * multiplier;
                multiplier *= 10;
            }
            number /= 10;
        }

        System.out.println("Number after removing duplicate digits: " + result);
    }

    private static boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}

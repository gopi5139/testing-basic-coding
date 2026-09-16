package coding.number_programs;

public class SmallestDigitInNumber {
    public static void main(String[] args) {
        int number = 912345;
        int smallestDigit = 9;
        while (number != 0) {
            int digit = number % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Smallest digit: " + smallestDigit);
    }
}

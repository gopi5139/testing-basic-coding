package coding.number_programs;

public class PrintArmstrongNumbersRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            result = (int) (result + Math.pow(digit, n));
            number /= 10;
        }
        return result == originalNumber;
    }
}

package coding.number_programs;

// 153 = 1 pow(3) + 5 pow(3) + 3 pow(3) = 1 + 125 + 27 = 153(Armstrong number)
// 154 = 1 pow(4) + 5 pow(4) + 4 pow(4) = 1 + 625 + 256 = 882(not an Armstrong number)
public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            result = (int) (result + Math.pow(digit, n));
            number /= 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

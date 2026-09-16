package coding.number_programs;

public class DuplicateDigitsInNumber {
    public static void main(String[] args) {
        int number = 12234561;
        int[] digitCount = new int[10];

        while (number != 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        System.out.println("Duplicate digits in the number:");
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > 1) {
                System.out.println(i + " appears " + digitCount[i] + " times");
            }
        }
    }
}

package coding.number_programs;

public class DecimalToBinaryWithoutBuiltInConversion {
    public static void decimalToBinary(int number) {
        int[] binary = new int[32];
        int index = 0;

        while (number > 0) {
            binary[index++] = number % 2;
            number /= 2;
        }

        System.out.print("Binary representation: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        decimalToBinary(13);
    }
}

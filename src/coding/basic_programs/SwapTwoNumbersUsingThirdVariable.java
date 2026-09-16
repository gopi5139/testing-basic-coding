package coding.basic_programs;

import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        int temp;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

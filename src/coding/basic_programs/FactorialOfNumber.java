package coding.basic_programs;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            if(num == 0) {
                System.out.println("Factorial of 0 is: 1");
                return; // Exit the program as factorial of 0 is 1
            } else if(num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return; // Exit the program as factorial is not defined for negative numbers
            }
            long factorial = 1; // Variable to store factorial result

            for(int i = 1; i <= num; i++) {
                factorial *= i; // Multiply factorial by current number
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

    }
}

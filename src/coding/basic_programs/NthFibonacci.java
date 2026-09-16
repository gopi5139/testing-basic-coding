package coding.basic_programs;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n) of the Fibonacci sequence: ");
        int n = sc.nextInt();
        int first = 0, second = 1, nthFibonacci = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                nthFibonacci = first;
            } else {
                nthFibonacci = first + second;
                first = second;
                second = nthFibonacci;
            }
        }
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
    }
}

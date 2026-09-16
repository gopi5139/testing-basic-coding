package coding.basic_programs;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if(num1>num2) {
            System.out.println(num1 + " is the largest number.");
        } else if(num2>num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

//        int ans = (num1>num2) ? num1 : num2;
//        System.out.println("The largest number is: " + ans);
//        int ans2 = Math.max(num1, num2);
//        System.out.println("The largest number using Math.max is: " + ans2);
    }
}

package basic_programs;

import java.util.Scanner;

public class FindDigitRepeatationInLargeNumber {

	public static void main(String[] args) {
		//Number of times verifyNumber got repeated in number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the long number");
		long number = sc.nextLong();
		System.out.println("Enter the number to check verified");
		int verifyNumber = sc.nextInt();
		int count = 0;
		while(number > 0){
			int rem = (int) (number % 10);
			if(rem == verifyNumber){
				count++;
			}
			number = number/10;
		}
		System.out.println(count);
	}
}

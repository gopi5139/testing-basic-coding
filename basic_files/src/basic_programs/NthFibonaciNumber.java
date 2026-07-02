package basic_programs;

import java.util.Scanner;

public class NthFibonaciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max number");
		int n = sc.nextInt();
		int a =0;
		int b = 1;
		int count =2;
		
//		while(count <= n){
//			int temp = b;
//			b = b+a;
//			a = temp;
//			count++;
//		}
//		System.out.println(b);
		
		System.out.print(a+ ","+ b);
		for(int i = 1; i <= n; i++) {
			int next = a + b;
			a = b;
			b = next;
			System.out.print(","+next);
		}
		System.out.println(count);
		
	}

}

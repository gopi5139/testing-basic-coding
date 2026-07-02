package array;

import java.util.Arrays;

public class ArrayReverseUsingSwap {

//	public static void main(String[] args) {
//		int[] a = {2,45,64,237,755};
//		int start =0;
//		int end = a.length-1;
//		int[] res = reverseOfArray(a,start,end);
//		System.out.println(Arrays.toString(res));
//	}
	
	public static void main(String[] args) {
		int[] s = {2, 45, 64, 237, 755};
		for(int i=0; i<s.length/2; i++) {
			int temp = s[s.length-(i+1)];
			s[s.length-(i+1)] = s[i];
			s[i] = temp;
		}
		System.out.println(Arrays.toString(s));
	}
	
	
	
	static int[] reverseOfArray(int[] arr, int start, int end){
		while(start<=end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		return arr;
	}
	
	static int[] swap(int[] b, int start, int end){
		int temp = b[start];
		b[start] = b[end];
		b[end] = temp;
		return b;
	}
}

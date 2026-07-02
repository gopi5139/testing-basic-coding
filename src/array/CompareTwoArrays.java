package array;

import java.util.Arrays;

public class CompareTwoArrays {
	public static void main(String[] args){
		int[] arr1 = {2,3,4};
		int[] arr2 = {2,3,4};
		if(arr1 == arr2){
			System.out.println("arrays are equal");
		}else{
			System.out.println("arrays are not equal");
		}
		
		if(arr1.equals(arr2)){
			System.out.println("arrays are equal");
		}else{
			System.out.println("arrays are not equal");
		}
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println("arrays are equal");
		}else{
			System.out.println("arrays are not equal");
		}
	}
}

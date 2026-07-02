package array;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args)
	{
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		int d = 4;
		int[] c = new int[b.length];
		for(int i = d; i < b.length; i++) {
			c[i-d] = b[i];
		}
		for(int i = b.length-d; i < b.length; i++) {
			c[i] = b[i+d-b.length];
		}
		System.out.println(Arrays.toString(c));
	}

}

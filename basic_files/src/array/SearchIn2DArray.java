package array;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] a = {{2,5,7},{76,45,98,20},{23,87,46,36,34},{69,46,98}};
		int target =69;
		int[] ans = search(a,target);
		System.out.println(Arrays.toString(ans));
		
		
		

	}
	static int[] search(int[][] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
				{
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
	}

}

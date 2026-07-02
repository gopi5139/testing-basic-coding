package array;

public class MaxIn2DArray {

	public static void main(String[] args) {
		int[][] arr={{87,8,678},{23,65,98,667,6454},{8,43,8,98765}};
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > temp) {
					temp = arr[i][j];
				}
			}
		}
		System.out.println(temp);
	}
}

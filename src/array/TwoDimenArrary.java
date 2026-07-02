package array;

public class TwoDimenArrary {
	public static void main(String[] args){
		int[][] a = new int[][]{{2,3,4},{5,6,7},{1,8,9}};
		for(int i=0; i<3; i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

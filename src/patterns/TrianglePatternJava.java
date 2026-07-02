package patterns;

public class TrianglePatternJava {

	public static void main(String[] args) {
		int n =5;
		for(int row = 1; row <= n; row++){
			int totalNoOfCols = n-(n-row);
			int noOfSpaces = n-totalNoOfCols;
			for(int s=0;s<noOfSpaces;s++){
				System.out.print(" ");
			}
			for(int col = 1; col <= totalNoOfCols ; col++){
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
	}
}

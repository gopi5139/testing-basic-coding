package patterns;

public class UpAndDownTrianglePattern {

	public static void main(String[] args) {
		int n =5, noOfCols = 0, noOfSpaces=0;
		
		for(int row = 1; row <= 2*n ; row++){
			noOfCols = row>n? 2*n-row: row;
			noOfSpaces = n - noOfCols;
			
			for(int s=0; s<noOfSpaces ; s++){
				System.out.print(" ");
			}
			for(int col = 1; col <= noOfCols; col++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}

package patterns;

public class NumberTrianglePalindromPattern {

	public static void main(String[] args) {
		int n=5;
		
		for(int row=0;row<n;row++){
			int noOfCols = row+1;
			int noOfSpaces = n-noOfCols;
			for(int s=0; s<noOfSpaces; s++){
				System.out.print(" ");
			}
			for(int i=1;i<=noOfCols;i++){
				System.out.print(i);
			}
			for(int j=noOfCols-1;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

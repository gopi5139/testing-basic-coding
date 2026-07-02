package basic_programs;

public class MaxAtEveryIndexPattern {

	public static void main(String[] args) {
		// Here it will calculate distance between from four walls like left, right, up and down and display max of all these at every index.
		int n =5;
		int originalN = n;
		n = 2*n;
		for(int row = 1; row < n; row++){
			for(int col = 1; col < n; col++){
				int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col))+1;
				System.out.print(atEveryIndex+" ");
			}
			System.out.println();
		}
	}

}

package basic_programs;

public class MinimumAtEveryIndexPattern {

	public static void main(String[] args) {
		// Here it will calculate distance between fromm four walls like left, right, up and down and display min of all these at every index.
		int n = 5;
		n = 2*n;
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				int atEveryIndex = Math.min(Math.min(row, col), Math.min(n-row, n-col));
				System.out.print(atEveryIndex);
			}
			System.out.println();
		}
	}
}

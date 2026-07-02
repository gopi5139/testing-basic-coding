package basic_programs;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		//you are given mxn integer grid accounts where account[i][j] is the amount of money 
		//the ith customer has in the jth bank. Return the wealth that the richest customer has.
		//A customer wealth is the amount of money they have in all their banks accounts. 
		//The richest customer is the customer that has the maximum wealth.
		
		/*Example :
				Input: accounts = [[1,2,3],[3,2,1]]
				output: 6
				Explanation: 1st customer has wealth = 1+2+3 =6
							 2nd customer has wealth = 3+2+1 =6
							 
							 both are having total of 6 
							 So it will return 6;*/
		
		int[][] arr = {{3,40,600},{33,67,40}};
		int ans = 0;
		int max = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++){
			for(int j=0 ; j<arr[i].length; j++){
				ans = ans + arr[i][j];
			}
			if(ans > max){
				max = ans;
				ans = 0;
			}
		}
		System.out.println(max);
	}
}

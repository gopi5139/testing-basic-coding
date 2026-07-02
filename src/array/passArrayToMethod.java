package array;

public class passArrayToMethod {
	public static void main(String[] args){
		 int[] a = {3,4,5,6};
		int res = sum(a);
		System.out.println(res);
	}
	
	public static int sum(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}

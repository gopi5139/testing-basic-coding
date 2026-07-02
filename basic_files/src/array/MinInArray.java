package array;

public class MinInArray {

	public static void main(String[] args) {
		int[] a = {10,39,02,45,64,43,45,2,0,8,3,7,1,56};
		int res = a[0];
		for(int i=1 ; i < a.length;i++){
			if(res > a[i]){
				res = a[i];
			}
		}
		System.out.println(res);
	}

}

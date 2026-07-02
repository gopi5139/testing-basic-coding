package array;

public class ArrayDisplay {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		a[0]= 10;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		int[][] v = new int[3][3];
		v[0][0]=20;
		v[0][1]=30;
		v[0][2]=40;
		v[1][0]=20;
		v[2][1]=30;
		v[2][2]=40;
		System.out.println(v[1][1]);
		
	}

}

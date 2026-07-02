package array;

public class ReturningArray {
	public static void main(String[] args){
		int[] a = m1();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	static int[] m1(){
		return new int[]{1,2,3,3};
	}

}

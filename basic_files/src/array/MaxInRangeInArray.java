package array;

public class MaxInRangeInArray {

	public static void main(String[] args) {
		int[] b = {3,56,76,384,34,27};
		int temp = 0;
		for(int i = 0; i<b.length; i++) {
			if(b[i]>temp) {
				temp = b[i];
			}
		}
		System.out.println(temp);
	}
}

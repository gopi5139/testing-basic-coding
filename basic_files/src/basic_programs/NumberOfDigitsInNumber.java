package basic_programs;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		int[] arr = {4,6568,34,677,23344};
		for(int i : arr){
			System.out.println((int)Math.log10(i)+1);
		}
	}
}

package basic_programs;

public class EvenNumberOfDigits {
	//even number of digits in array [45 = 2, 6654 = 4, 678544 = 6]
	public static void main(String[] args) {
		int[] arr = {45,3,654,6654,56744,678544};
		int count = 0;
		for(int a :arr){
			if(evenNumberOfDigits(a)){
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean evenNumberOfDigits(int arr){
			int digits = digits(arr);
			return digits%2==0;	
	}
	
	static int digits(int num){
		return (int)Math.log10(num)+1;
	}

}

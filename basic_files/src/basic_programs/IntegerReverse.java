package basic_programs;

public class IntegerReverse {
	public static void main(String[] args) {
		int input = 4782;
		int reversed = 0;
		while(input>0) {
			int rem = input%10;
			reversed = reversed * 10 + rem;
			input = input/10;
		}
		System.out.println(reversed);
	}
}

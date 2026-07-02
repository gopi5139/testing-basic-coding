package basic_programs;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		int a = 10,b = 40, c = 30;
	//	int max = Math.max(	a, Math.max(c, b));
		int max = a;
		if(b > max){	
			max = b;
		}
		if(c > max){
			max = c;
		}
		System.out.println(max);
	}
}

package basic_programs;

public class PrettyPrinting {

	public static void main(String[] args) {
		float a = 123.45554f;
		printUptoTwoDecimalPlacesOnly(a);
		displayPieValue();
	}
	
	static void printUptoTwoDecimalPlacesOnly(float f){
		System.out.printf("Formatted number is %.2f", f);
		System.out.println();
		
	}
	
	static void displayPieValue(){
		System.out.printf("Pie: %.3f",Math.PI);
		System.out.println();
		System.out.printf("Hello My name is %s and i am a %s","Venkata Ravi Kumar","Software Engineer");
	}
}

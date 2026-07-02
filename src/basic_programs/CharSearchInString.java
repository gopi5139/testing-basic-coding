package basic_programs;

public class CharSearchInString {

	public static void main(String[] args) {
		String s = "Gopi Kumar";
		char target = 'g';
		boolean isAvailable = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == target) {
				isAvailable = true;
			}
		}
		System.out.println(isAvailable);
	}
}

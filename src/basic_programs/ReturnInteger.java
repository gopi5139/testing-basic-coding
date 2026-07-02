package basic_programs;

public class ReturnInteger {
	public static void main (String[] args) {
		String s = "Gopi*12390#";
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if((int)s.charAt(i) <= 57 && (int)s.charAt(i) >= 48) {
				System.out.print(s.charAt(i));
				count++;
			}
		}
		System.out.println();
		System.out.println("count:"+count);
		
		int count1 = 0;
		for(char a : s.toCharArray()) {
			if(Character.isDigit(a)) {
				System.out.print(a);
				count1++;
			}
		}
		System.out.println();
		System.out.println("count1:"+count1);
		
		int count2 = 0;
		for(char a : s.toCharArray()) {
			if(Character.isAlphabetic(a)) {
				System.out.print(a);
				count2++;
			}
		}
		System.out.println();
		System.out.println("count2:"+count2);
	}
}

package basic_programs;

public class VowelsCounter {
	public static void main(String[] args){
		String s = "Manikumar is presenting";
		int count = 0;
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				count = count+1;
			}
		}
		System.out.println(count);
	}
}

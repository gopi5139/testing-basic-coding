package coding.string_programs;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String text = "automation";
        int vowels = 0, consonants = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}

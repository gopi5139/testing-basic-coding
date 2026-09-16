package coding.string_programs;

public class CountDigitsAndSpecialCharacters {
    public static void main(String[] args) {
        String text = "Java123@#";
        int digits = 0, specials = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) digits++;
            else if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) specials++;
        }
        System.out.println("Digits: " + digits + ", Special characters: " + specials);
    }
}

package coding.string_programs;

public class CheckIfStringContainsOnlyNumericCharacters {
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String value = "12345";
        System.out.println("Is numeric: " + isNumeric(value));
    }
}

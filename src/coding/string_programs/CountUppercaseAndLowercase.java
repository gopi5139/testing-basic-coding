package coding.string_programs;

public class CountUppercaseAndLowercase {
    public static void main(String[] args) {
        String text = "Java123!";
        int uppercase = 0, lowercase = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) uppercase++;
            else if (Character.isLowerCase(ch)) lowercase++;
        }
        System.out.println("Uppercase: " + uppercase + ", Lowercase: " + lowercase);
    }
}

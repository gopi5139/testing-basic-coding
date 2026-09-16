package coding.string_programs;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String text = "madam";
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

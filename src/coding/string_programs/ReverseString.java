package coding.string_programs;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Selenium";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}

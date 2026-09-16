package coding.string_programs;

public class ReverseStringWithoutUsingReverse {
    public static void main(String[] args) {
        String input = "Java";
        char[] chars = input.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        System.out.println("Reversed string: " + reversed);
    }
}

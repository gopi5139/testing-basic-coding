package coding.string_programs;

public class ReverseStringUsingForLoop {
    public static void main(String[] args) {
        String input = "automation";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}

package coding.string_programs;

public class RemoveSpecialCharactersFromString {
    public static void main(String[] args) {
        String text = "Java@123!";
        String result = text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
    }
}

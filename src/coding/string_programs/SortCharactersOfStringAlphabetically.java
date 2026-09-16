package coding.string_programs;

import java.util.Arrays;

public class SortCharactersOfStringAlphabetically {
    public static String sortCharacters(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "selenium";
        System.out.println("Sorted characters: " + sortCharacters(input));
    }
}

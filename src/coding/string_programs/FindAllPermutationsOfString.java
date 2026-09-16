package coding.string_programs;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutationsOfString {
    public static void permute(String str) {
        List<String> result = new ArrayList<>();
        permuteHelper(str.toCharArray(), 0, result);
        System.out.println(result);
    }

    private static void permuteHelper(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permuteHelper(chars, index + 1, result);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        permute("ABC");
    }
}

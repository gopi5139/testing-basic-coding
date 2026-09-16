package coding.string_programs;

public class ReplaceDuplicateSpacesWithSingleSpace {
    public static String replaceDuplicateSpaces(String sentence) {
        return sentence.trim().replaceAll("\s+", " ");
    }

    public static void main(String[] args) {
        String sentence = "Java    is     powerful";
        System.out.println(replaceDuplicateSpaces(sentence));
    }
}

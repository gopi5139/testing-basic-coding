package coding.string_programs;

public class ReverseOrderOfWords {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

package coding.string_programs;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

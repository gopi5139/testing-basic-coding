package coding.string_programs;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.trim().split("\s+");
        System.out.println("Word count: " + words.length);
    }
}

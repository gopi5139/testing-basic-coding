package coding.string_programs;

public class FindShortestWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful programming";
        String shortest = sentence.split(" ")[0];
        for (String word : sentence.split(" ")) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println("Shortest word: " + shortest);
    }
}

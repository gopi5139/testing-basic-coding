package coding.string_programs;

public class FindLongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful programming language";
        String longest = "";
        for (String word : sentence.split(" ")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
    }
}

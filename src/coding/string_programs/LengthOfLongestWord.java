package coding.string_programs;

public class LengthOfLongestWord {
    public static int findLongestWordLength(String sentence) {
        String[] words = sentence.split("\s+");
        int longest = 0;

        for (String word : words) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String sentence = "Java is powerful";
        System.out.println("Length of the longest word: " + findLongestWordLength(sentence));
    }
}

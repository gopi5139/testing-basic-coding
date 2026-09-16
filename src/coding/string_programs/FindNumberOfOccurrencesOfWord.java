package coding.string_programs;

public class FindNumberOfOccurrencesOfWord {
    public static int countWordOccurrences(String sentence, String word) {
        String[] words = sentence.toLowerCase().split("\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "java is java and java is good";
        System.out.println("Occurrences: " + countWordOccurrences(sentence, "java"));
    }
}

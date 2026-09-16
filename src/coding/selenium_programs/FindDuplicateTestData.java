package coding.selenium_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateTestData {
    public static void main(String[] args) {
        List<String> testData = Arrays.asList("user1", "user2", "user1", "user3");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String value : testData) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
        System.out.println("Duplicate test data: " + duplicates);
    }
}

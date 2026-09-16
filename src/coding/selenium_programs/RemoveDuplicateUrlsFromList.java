package coding.selenium_programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateUrlsFromList {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://example.com", "https://example.com", "https://selenium.dev");
        LinkedHashSet<String> uniqueUrls = new LinkedHashSet<>(urls);
        System.out.println(uniqueUrls);
    }
}

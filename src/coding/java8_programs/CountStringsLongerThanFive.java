package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class CountStringsLongerThanFive {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Selenium", "Automation", "API");
        long count = names.stream().filter(name -> name.length() > 5).count();
        System.out.println("Count: " + count);
    }
}

package coding.java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Java", "Selenium", "Java");
        Map<String, Long> frequency = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(frequency);
    }
}

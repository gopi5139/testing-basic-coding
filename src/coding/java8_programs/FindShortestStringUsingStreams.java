package coding.java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindShortestStringUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Selenium", "API");
        System.out.println(names.stream().min(Comparator.comparingInt(String::length)).orElse(""));
    }
}

package coding.java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestStringUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Selenium", "Automation");
        System.out.println(names.stream().max(Comparator.comparingInt(String::length)).orElse(""));
    }
}

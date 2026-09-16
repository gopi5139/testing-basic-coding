package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringsToUppercaseUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "selenium", "api");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

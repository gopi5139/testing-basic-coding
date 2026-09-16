package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindDuplicateElementsUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);
        numbers.stream().filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n)).distinct().forEach(System.out::println);
    }
}

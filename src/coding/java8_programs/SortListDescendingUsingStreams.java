package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class SortListDescendingUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 3, 2, 4);
        numbers.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
    }
}

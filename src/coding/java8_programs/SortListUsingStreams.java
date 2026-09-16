package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class SortListUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 3, 2, 4);
        numbers.stream().sorted().forEach(System.out::println);
    }
}

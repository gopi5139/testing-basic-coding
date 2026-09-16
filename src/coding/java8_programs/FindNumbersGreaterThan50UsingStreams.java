package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindNumbersGreaterThan50UsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 30, 50, 60, 80, 90);
        numbers.stream().filter(n -> n > 50).forEach(System.out::println);
    }
}

package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindMaximumNumberUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(numbers.stream().max(Integer::compareTo).orElse(0));
    }
}

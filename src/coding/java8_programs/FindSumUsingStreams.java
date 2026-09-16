package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindSumUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}

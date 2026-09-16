package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindSecondHighestNumberUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Integer secondHighest = numbers.stream().sorted((a, b) -> b.compareTo(a)).distinct().skip(1).findFirst().orElse(null);
        System.out.println(secondHighest);
    }
}

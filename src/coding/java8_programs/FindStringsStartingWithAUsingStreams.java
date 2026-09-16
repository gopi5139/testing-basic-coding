package coding.java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindStringsStartingWithAUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Apricot", "Mango");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}

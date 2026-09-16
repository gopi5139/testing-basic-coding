package coding.collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestElementInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 5, 20, 3, 15));
        List<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted, Collections.reverseOrder());
        System.out.println(sorted.get(1));
    }
}

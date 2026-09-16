package coding.collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestElementInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 5, 20, 3));
        System.out.println(Collections.max(list));
    }
}

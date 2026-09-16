package coding.collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListDescending {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 1, 3, 2, 4));
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}

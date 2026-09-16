package coding.collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 1, 3, 2, 4));
        Collections.sort(list);
        System.out.println(list);
    }
}

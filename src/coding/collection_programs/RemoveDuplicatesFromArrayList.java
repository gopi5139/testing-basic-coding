package coding.collection_programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4));
        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);
    }
}

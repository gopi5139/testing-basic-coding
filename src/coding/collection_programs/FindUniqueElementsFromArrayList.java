package coding.collection_programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class FindUniqueElementsFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4));
        System.out.println(new LinkedHashSet<>(list));
    }
}

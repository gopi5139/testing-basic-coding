package coding.collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.reverse(list);
        System.out.println(list);
    }
}

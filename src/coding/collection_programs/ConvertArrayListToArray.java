package coding.collection_programs;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(java.util.Arrays.toString(arr));
    }
}

package coding.collection_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}

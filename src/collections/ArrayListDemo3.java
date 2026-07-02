package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		String[] str = {"Dog", "Cat", "Elephant"};
		ArrayList al = new ArrayList(Arrays.asList(str));
		System.out.println(al);
	}
}

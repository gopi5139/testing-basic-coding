package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(3);
		lhs.add(2);
		lhs.add(6);
		
		System.out.println(lhs);

	}

}

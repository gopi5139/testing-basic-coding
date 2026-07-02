package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Z");
		l.add("C");
		l.add("B");
		l.add("A");
		l.add("Y");
		
		LinkedList l_dup = new LinkedList();
		l_dup.addAll(l);
		System.out.println(l_dup);//[X, Z, C, B, A, Y]
		l.removeAll(l);
		System.out.println(l); //[]
		
		System.out.println("Before sorting :"+l_dup);//[X, Z, C, B, A, Y]
		
		Collections.sort(l_dup);
		System.out.println("Sorting :"+l_dup); //[A, B, C, X, Y, Z]
		
		Collections.sort(l_dup, Collections.reverseOrder());
		System.out.println("Sorting revered:"+l_dup); //[Z, Y, X, C, B, A]
		
		Collections.shuffle(l_dup);
		System.out.println("After Shuffling:"+l_dup); //[A, Y, C, B, X, Z]
	}

}

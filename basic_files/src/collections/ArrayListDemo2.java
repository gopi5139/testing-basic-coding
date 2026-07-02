package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("x");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("y");
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup); //[x, z, a, b, c, d, y]
		al_dup.removeAll(al);
		System.out.println(al_dup); //[]
		
		//sorting collections - Collections.sort()
		System.out.println("Elements in the array list:"+al); //[x, z, a, b, c, d, y]
		Collections.sort(al);
		System.out.println("Elements in the array list after sorting:"+al); //[a, b, c, d, x, y, z]
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting in reverse order:"+al); //[z, y, x, d, c, b, a]
		Collections.shuffle(al);
		System.out.println("Elements in the array list after shuffling:"+al); //[b, y, z, d, a, c, x] random order
    }
}

package collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> even = new HashSet<Integer>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		
		System.out.println("HashSet:"+even); //[2, 4, 6, 8, 10]
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.addAll(even);
		numbers.add(11);
		System.out.println("New HashSet:"+numbers); //[2, 4, 6, 8, 10, 11]
		
		numbers.remove(6);
		System.out.println("Removed HashSet:"+numbers); //[2, 4, 8, 10, 11]
		
		numbers.removeAll(even);
		System.out.println("Removed HashSet:"+numbers); //[11]
	}

}

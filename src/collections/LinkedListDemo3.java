package collections;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		System.out.println(l); //[dog, dog, cat, horse]
		
		l.addFirst("tiger");
		l.addLast("Lion");
		System.out.println("After adding first and last:"+l); //[tiger, dog, dog, cat, horse, Lion]
		
		System.out.println(l.get(3)); //cat
		System.out.println(l.getFirst()); //tiger
		System.out.println(l.getLast()); //Lion
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last"+l); //[dog, dog, cat, horse]
	}

}

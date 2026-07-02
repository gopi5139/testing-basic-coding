package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// Declare Linked List
		LinkedList l = new LinkedList();
//		LinkedList<String> l = new LinkedList<String>();
//		LinkedList<Integer> l = new LinkedList<Integer>();

		//Add Elements in LinkedList
		l.add(100);
		l.add("Welcome");
		l.add(22.1);
		l.add(null);
		l.add(true);
		
		System.out.println(l); //[100, Welcome, 22.1, null, true]
		System.out.println("Size:"+l.size()); //5
		
		//remove
		l.remove(2);
		System.out.println("After removing element:"+l);//[100, Welcome, null, true]
		l.remove("Welcome");
		System.out.println("After removing element:"+l);//[100, null, true]
		
		//inserting element
		l.add(1, "Task");
		System.out.println("After insertion:"+l);//[100, Task, null, true]
		
		//retriving the element
		System.out.println(l.get(3)); //true
		
		//change the value
		l.set(2, "Val");
		System.out.println("After changing value:"+l); //[100, Task, null, Val]
		
		//contains
		System.out.println(l.contains("Val"));//true
		
		//isEmpty
		System.out.println(l.isEmpty());//false
		
		//Reading elements using for loop
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		//Reading elements using for each loop
		for(Object e : l) {
			System.out.println(e);
		}
		
		//Reading elements using Iterator method
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

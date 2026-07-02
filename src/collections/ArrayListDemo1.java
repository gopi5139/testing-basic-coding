package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	//if we want to represent a group of individual objects as a single entity where duplicate objects are allowed and insertion order is preserved.
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
//		ArrayList<String> al = new ArrayList<String>();
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		List al = new ArrayList();
		
		//Add new elements to array list
		al.add(1);
		al.add("Welcome");
		al.add(21.2);
		al.add(true);
		
		System.out.println(al); //[1, Welcome, 21.2, a, true]
		System.out.println("Size:"+al.size()); //Size:5
		
		//remove elements
		al.remove(1);
		al.remove(true);
		System.out.println("After Removing :"+al); //[1, 21.2]
		
		//inserting elements
		al.add(1, "Array");
		System.out.println("After Insertion:"+al); //[1, Array, 21.2]
		
		System.out.println(al.indexOf("Array")); //1
		
		//retrieve specific element
		System.out.println(al.get(2)); //21.2
		
		//change/replace element
		al.set(1, "list");
		System.out.println("After replacing element:"+al); //[1, list, 21.2]
		
		//searching - contains() - True/False
		System.out.println("Value available or not:"+al.contains("list")); //true
		System.out.println("Value available or not:"+al.contains(100)); //false
		
		//isEmpty()
		System.out.println(al.isEmpty()); //false
		
		//1) For Loop
		System.out.println("Reading elements by using for loop ..........");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//2) For Each Loop
		System.out.println("Reading elements by using for each loop ..........");
		for(Object e : al) {
			System.out.println(e);
		}
		
		//3) Iterator
		System.out.println("Reading elements by using Iterator Method ..........");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}

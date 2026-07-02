package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); // default capacity 16 and Load Factor 0.75
		
		//HashSet hs = new HashSet(100); //initial capacity 100
		
		//HashSet hs = new HashSet(100, (float)0.95); //initial capacity 100 and load factor 0.95
		//HashSet<Integer> hs = new HashSet<Integer>();
		//HashSet<String> hs = new HashSet<String>();
		hs.add(100);
		hs.add("Welcome");
		hs.add(true);
		hs.add(22.4);
		hs.add(null);
		
		System.out.println(hs); //[22.4, null, 100, Welcome, true]  insertion order not preserved
		
		hs.remove("Welcome");
		System.out.println("After removing element:"+hs); //[22.4, null, 100, true]

		//contains
		System.out.println(hs.contains("Welcome"));  //false
		System.out.println(hs.isEmpty());  //false
		
		//Reading elements using For each loop is not possible as we will not have index
		
		
		//Reading elements using For each loop
		for(Object e : hs) {
			System.out.println(e);
		}
		
		//Reading elements using Iterator 
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

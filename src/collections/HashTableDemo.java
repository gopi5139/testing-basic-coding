package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		//Hashtable ht = new Hashtable();
		//Hashtable ht = new Hashtable(100);//initial capacity
		//Hashtable ht = new Hashtable(100, 0.75);//initial capacity, load factor ratio
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(101, "A");
		ht.put(102, "C");
		ht.put(103, "D");
		ht.put(104, "C");
		//ht.put(null, "A"); // null will throw exception - NullPointerException
		//ht.put(105, null); // null will throw exception - NullPointerException
		System.out.println(ht); //{104=C, 103=D, 102=C, 101=A}
		System.out.println(ht.get(104)); //C
		ht.remove(103);
		System.out.println(ht);//{104=C, 102=C, 101=A}
		System.out.println(ht.containsKey(103)); //false
		System.out.println(ht.containsValue("C")); //true
		System.out.println(ht.isEmpty()); //false
		
		System.out.println(ht.keySet());//[104, 102, 101]
		System.out.println(ht.values());//[C, C, A]
		System.out.println(ht.entrySet());//[104=C, 102=C, 101=A]
		
		for(Object e:ht.keySet()) {
			System.out.println(e);
		}
		
		for(Object e:ht.values()) {
			System.out.println(e);
		}
		
		for(Object e:ht.keySet()) {
			System.out.println(ht.get(e));
		}
		
		for(Entry e:ht.entrySet()) {
			System.out.println(e.getKey() + "-" +e.getValue());
		}
		
		Set s = ht.entrySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			System.out.println(entry.getKey()+ "-"+ entry.getValue());
		}
	}

}

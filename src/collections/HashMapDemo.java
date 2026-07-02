package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap m = new HashMap();
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(101, "A");
		m.put(102, "C");
		m.put(103, "Z");
		m.put(104, "A");
		m.put(105, "Y");
		
		System.out.println(m); //{101=A, 102=C, 103=Z, 104=G, 105=Y}
		
		System.out.println(m.get(103)); //Z
		
		m.remove(103);
		System.out.println(m); //{101=A, 102=C, 104=G, 105=Y}
		
		System.out.println(m.containsKey(103)); //false
		System.out.println(m.containsValue("Y")); //true
		
		System.out.println(m.isEmpty()); //false
		
		System.out.println(m.keySet());//[101, 102, 104, 105]
		System.out.println(m.values());//[A, C, G, Y]
		System.out.println(m.entrySet());//[101=A, 102=C, 104=A, 105=Y]
		
		for(Object e:m.keySet()) {
			System.out.println(e);
		}
		
		for(Object e:m.values()) {
			System.out.println(e);
		}
		
		for(Object e:m.keySet()) {
			System.out.println(m.get(e));
		}
		
		for(Entry e:m.entrySet()) {
			System.out.println(e.getKey() + "-" +e.getValue());
		}
		
		Set s = m.entrySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			System.out.println(entry.getKey()+ "-"+ entry.getValue());
		}
	}

}

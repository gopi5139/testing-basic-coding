package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(null);
		s.push('j');
		s.add(100);
		s.add(60);
		s.add("xyx");
		Enumeration e = s.elements();
		/*while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}*/
		
		Iterator i = s.iterator();
		/*while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		ListIterator it = s.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.search('j'));
		System.out.println(s.search(null));
		System.out.println(s);
	}

}

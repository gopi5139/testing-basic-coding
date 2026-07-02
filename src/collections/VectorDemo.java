package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("abc");
		v.add(1, 5);
		v.addElement('a');
		//v.removeElement(5);
		System.out.println(v.capacity());
		for(int i=0;i<8;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(11);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Object o = e.nextElement();
			System.out.println(o);
		}
		System.out.println(v.capacity());
	}

}

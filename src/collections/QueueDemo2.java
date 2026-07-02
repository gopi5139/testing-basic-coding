package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		LinkedList pq = new LinkedList();
		
		//adding element add() and offer() - accepts only same type
		pq.add("A");
		pq.add("C");
		pq.add("C");
		pq.offer(100);
		
		System.out.println(pq); //[A, C, C, 100]
		
		//return head element;
		System.out.println(pq.element());//if empty queue then returns exceptions as NoSuchElementException else return head element
		System.out.println(pq.peek());//if empty queue then returns null else return head element
		
		//return and remove element from queue
		System.out.println(pq.remove());// A //if empty queue then returns exceptions as NoSuchElementException else return head element and remove from queue
		System.out.println(pq); //[C, C, 100]
		System.out.println(pq.poll());// C //if empty queue then returns null else return head element and remove from queue
		System.out.println(pq); //[C, 100]
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object e : pq) {
			System.out.println(e);
		}
	}

}

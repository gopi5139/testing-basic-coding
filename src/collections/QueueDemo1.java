package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		//adding element add() and offer() - accepts only same type
		pq.add("A");
		pq.add("C");
		pq.add("C");
		pq.offer("D");
		
		System.out.println(pq); //[A, C, C, D]
		
		//return head element;
		System.out.println(pq.element());//if empty queue then returns exceptions as NoSuchElementException else return head element
		System.out.println(pq.peek());//if empty queue then returns null else return head element
		
		//return and remove element from queue
		System.out.println(pq.remove());// A //if empty queue then returns exceptions as NoSuchElementException else return head element and remove from queue
		System.out.println(pq); //[C, C, D]
		System.out.println(pq.poll());// C //if empty queue then returns null else return head element and remove from queue
		System.out.println(pq); //[C, D]
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object e : pq) {
			System.out.println(e);
		}
	}

}

package collection;

import java.util.*;

public class QueueExamp {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);  //adds single element
		q.add(20);
		q.add(50);
		q.add(40);
		q.add(30);
		System.out.println(q);
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(200);
		q.addAll(ll);  //add collection
		System.out.println(q);
		//q.clear();  //empty the queue
		System.out.println(q);
		System.out.println(q.contains(55));  //checks whether the elemnt is there in queue or not
		System.out.println(q.containsAll(ll));  //check whether whole collection exists in the queue or not
		System.out.println(q.element());  //returns the first element
		System.out.println(q.equals(ll));  //compares two collections
		System.out.println(q.isEmpty());  //checks whether collection is empty or not
		q.offer(150);   //adds at last in queue
		System.out.println(q);
		System.out.println(q.peek());  //returns the first element of queue
		System.out.println(q.poll());   //returns the first element and delete it also
		System.out.println(q);
		q.remove(); //it removes the first element
		System.out.println(q);
		q.remove(50);   //it remove the specific element
		System.out.println(q);   
		//q.removeAll(ll); //it removes all the element present in the collection
		//System.out.println(q);
		q.retainAll(ll);  //vice versa of remove all it keeps all the values present in the collection and delete all others
		System.out.println(q);
		System.out.println(q.size());  //returns the size of queue
		
	}
	
}

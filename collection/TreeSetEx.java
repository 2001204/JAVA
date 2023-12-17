package collection;
import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(20);  //add single element
		System.out.println(ts);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(40);
		ll.add(100);
		ts.addAll(ll);  //to add collection
		System.out.println(ts);
		System.out.println(ts.ceiling(25));  //returns the 1st element greater than or equal to the number passed
		//ts.clear();  //it empty the tree set
		System.out.println(ts);
		System.out.println(ts.contains(50));  //check whether element is there or not
		System.out.println(ts.containsAll(ll)); //checks whether whole collection is there or not in the tree set
		Iterator<Integer> itr = ts.descendingIterator();  //it gives the object of iterator starting from last element
		while(itr.hasNext()) {  //it tells whether next element exists or not
			System.out.print(itr.next()+" ");  //it moves to next element
		}
		System.out.println();
		NavigableSet<Integer> ns= ts.descendingSet();  //it will give u object of navigable set but in descending order
		System.out.println(ns);
		ns.remove(50);    //any changes made with navigable set will effect the main tree set and viceversa
		System.out.println(ts);
		System.out.println(ts.equals(ll));  //it compares two collections
		System.out.println(ts.first());   //it returns the first element
		System.out.println(ts.floor(25));  //returns the 1st element less than or equal to the number passed
		SortedSet<Integer> s = ts.headSet(35);  //it returns the sorted set from start to that element
		System.out.println(s);
		System.out.println(ts.headSet(30, true));  //it returns the sorted set from start to that element with false saying whether to include or not
		System.out.println(ts.higher(20));  //it will return next greater value of the given element
		System.out.println(ts.last());  //it will  return the last element
		System.out.println(ts.lower(50));  //it will return next smaller element of the given element
//		ts.remove(40);  //removes single element
		
//		System.out.println(ts);
		//ts.removeAll(ll); //removes entire collection from tree set
//		System.out.println(ts);  
//		System.out.println(ts.pollFirst());  //returns first element and removes it
//		System.out.println(ts);
//		System.out.println(ts.pollLast());  //returns last and delete it
//		System.out.println(ts);
		
//		ts.retainAll(ll);  //it removes all the element except the element present in the collection
		System.out.println(ts);
		System.out.println(ts.size());  //returns the size of the collection
		System.out.println(ts.subSet(20,40));  //it returns the sorted set starting from till end parameter end parameter is not included
		System.out.println(ts.subSet(20,false,40,true)); //it returns the sorted set with from and to value with conditon whether to include or not
		System.out.println(ts.tailSet(20));  //it returns the sorted set from that element to last element
		System.out.println(ts.tailSet(20,false));  //it returns the sorted set from that element to last element and specify whether that element needs to be taken or not
		
		
	}
}

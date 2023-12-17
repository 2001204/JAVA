package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(30);   //add an element in linkedlist
		ll.add(20);
		ll.add(40);
		ll.add(10);
		System.out.println(ll);
		ll.add(2, 50);
		System.out.println(ll);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		ll.addAll(al);  //add a collection in last
		System.out.println(ll);
		ll.addAll(1,al);  //add a collection at a particular index
		System.out.println(ll);
		ll.addFirst(60);  //add an object at the start
		System.out.println(ll);
		ll.addLast(500);   //add an object at the last
		System.out.println(ll);
		//ll.clear(); //empty the linkedlist
		System.out.println(ll);
		System.out.println(ll.contains(50));   //check value is present or not
		Iterator<Integer> itr = ll.descendingIterator();  //gives the value in reverse direction 
		while(itr.hasNext()) {   // check object is there or not
			System.out.println(itr.next());  //returns the next object
		}
		System.out.println(ll.element());  //it returns the head of the linkedlist
		System.out.println(ll.equals(al));  //compares two collections
		System.out.println(ll);
		System.out.println(ll.get(5));   //get the value from index
		System.out.println(ll.getFirst());  //gives first element in the linkedlist
		System.out.println(ll.getLast());  //gives the last element in the linkedlist
		int index = ll.indexOf(20);      //gives the index of the value
		System.out.println(index);
		System.out.println(ll.isEmpty());  //checks the linkedlist is empty or not
		System.out.println(ll.lastIndexOf(100));  //returns the index of element from last
		ListIterator<Integer> litr = ll.listIterator(5);
		System.out.println("-----------------------");
		while(litr.hasNext()) {
			System.out.println(litr.next()); 
			System.out.println(litr.nextIndex());  //returns the next index
		}
		ll.offer(600); //add element at last 
		System.out.println("---------------");
		System.out.println(ll);
		ll.offerFirst(10);  //add elemnt at first
		ll.offerLast(700);   //add element at last
		System.out.println(ll);
		System.out.println(ll.peek());  //return the first element
		System.out.println(ll.peekFirst()); //return first element
		System.out.println(ll.peekLast()); //return last element
		System.out.println(ll.poll());  //return and delete first element 
		System.out.println(ll);
		System.out.println(ll.pollFirst());  //return and delete first element 
		System.out.println(ll);
		System.out.println(ll.pollLast());  //return and delete last element 
		System.out.println(ll);
		System.out.println(ll.pop());  //return and removes first element
		System.out.println(ll);
		ll.push(80);          // add element at head
		System.out.println(ll);   
		System.out.println(ll.remove());  //same as pollfirst
		System.out.println(ll);
		System.out.println(ll.remove(1));  //removes the value at specific index
		System.out.println(ll);
	//	ll.removeAll(al);  //it removes the values which are present in the collection passed
		System.out.println(ll);
		ll.removeFirst(); //same as pollfirst
		ll.removeLast(); //same as polllast
		System.out.println(ll);
		ll.removeFirstOccurrence(300);  //remove first occurrence of element from start
		System.out.println(ll);
		ll.removeLastOccurrence(300);   //remove first occurrence of element from last
		System.out.println(ll);
		//ll.retainAll(al); //remove all elements except the elements present in the collection
		System.out.println(ll);
		System.out.println(ll.size());  //returns the size of linkedlist
		ll.set(0, 500);  //replace the given value at the particular index
		System.out.println(ll);
		System.out.println(ll.subList(2, 5));  //gives a list from start to end index but end is not included
		Collections.sort(ll);  //used to sort
		System.out.println(ll);
		
		int index1 = Collections.binarySearch(ll, 50);
		System.out.println(index1);  //used to search
		
	}

}

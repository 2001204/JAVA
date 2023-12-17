package collection;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		System.out.println(hs.add(10));
		System.out.println(hs.add(10));
		hs.add(40);
		hs.add(30);
		hs.add(20); // add 1 element
		System.out.println(hs);
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(200);
		hs.addAll(ll); // add collection
		System.out.println(hs);
		// hs.clear(); //empty the hashset
		// System.out.println(hs);
		System.out.println(hs.contains(25)); // checks value is present in hashset or not
		System.out.println(hs.containsAll(ll)); // checks whether the collection exists in hashset or not
		System.out.println(hs.isEmpty()); // check hashset is empty or not
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		hs.remove(200); // removes particular element
		System.out.println(hs);
		// hs.removeAll(ll); //remove all the elements present in the collection
		// System.out.println(hs);
		hs.retainAll(ll); // reverse of remove all, it deletes all the elements except the elements
							// present in the collection
		System.out.println(hs);
		System.out.println(hs.size()); // returns the size of hashset
	}

}

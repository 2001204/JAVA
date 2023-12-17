package collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(50);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10); //add single value
		lhs.add(50);  //duplicate not allowed
		System.out.println(lhs);  //insertion order is preserved
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(40);
		ll.add(100);
		lhs.addAll(ll);  //add the whole collection
		System.out.println(lhs);
		//other functions remains at is as of hashset
	}

}

package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamp {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(10);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		int index = Collections.binarySearch(al, 10);
		System.out.println(index);
		
	}
}

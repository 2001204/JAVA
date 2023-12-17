package collection;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5);
		al.add("Nipun");  //add data
		System.out.println(al);
		System.out.println(al.get(1));  //get value from specific index
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(50);
		a.add(100);
		a.add(150);
		al.addAll(a);  //add another collection to the existing one
		System.out.println(al);
		al.remove(2);   //remove data from particular index
		System.out.println(al);
		al.add(2, 30);
		System.out.println(al);  //add element at a specific index
		al.addAll(1, a);
		System.out.println(al);   //add collection at a specific index
		a.remove(1);
		System.out.println(a);
		System.out.println(al);
		//al.clear();   //empty the collection
		System.out.println(al);
		System.out.println(al.contains(500));  //it checks whether value exists in the collection or not
		System.out.println(al.containsAll(a));  //it checks whether collection exists in the collection or not
		System.out.println(al.equals(a));    //it compares two collection
		System.out.println(al.indexOf(50));  //it returns the index of value
		System.out.println(al.isEmpty());  //it checks whether collection is empty or not
		Iterator itr = al.iterator();
		while(itr.hasNext()) {   //it tells whether value if there on next index or not
			System.out.println(itr.next());  //moves to next index's value
		}
		System.out.println(al.lastIndexOf(50));  //it gives index of value from last
		al.removeAll(a);  //it removes all the values of that collection
		System.out.println(al);
		ListIterator litr =al.listIterator();
		while(litr.hasNext()) {   //it tells whether value if there on next index or not
			System.out.println(litr.next());  //moves to next index's value
		}
		System.out.println("-----------------------");
		ListIterator litr1 =al.listIterator(2);  //iterate over collection starting from given index
		while(litr1.hasNext()) {   //it tells whether value if there on next index or not
			System.out.println(litr1.next());  //moves to next index's value
		}
		
	//	al.retainAll(a);   //it retains only that value which are present in collection all other will be deleted
		System.out.println(al);
		al.set(4, 200);  // it used to update the value at particular index
		System.out.println(al);
		System.out.println(al.size());  //gives the size of collection
		List a2 = al.subList(2,4);   //it breaks into a list starting from 1st param to the 2nd param (2nd param is excluded)
		System.out.println(a2);
		Object[] arr = al.toArray();   //converts into array
		for(int i=0;i<arr.length;i++) {     // 1 2 3 4 5 6 7 8 9
			System.out.println(arr[i]);
		}
	} 

}


//123 - one hundred and twenty three
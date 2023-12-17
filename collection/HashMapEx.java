package collection;
import java.util.*;
import java.util.Map.Entry;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(15, "five");
		map.put(35, "three");
		map.put(21, "one");
		map.put(12, "two");
		map.put(45, "four");  //add single pair of element to map
		map.put(12, "twelve");  //overrides existing one  twelve will replace two
		System.out.println(map);
		//single pair of element in map is known as Entry
		//map.clear();  //it empties the map
		//System.out.println(map);
		map.compute(35, (key,value)->key<20?"fifty "+value :"five "+value);  //present ya na ho it will perform
		System.out.println(map);
		map.compute(25, (key,value)->key<20?"fifty "+value :"five "+value);  
		System.out.println(map);
		map.computeIfPresent(12, (key,value)->key<20?"fifty "+value :"five "+value);  //perform only if present
		System.out.println(map);
		map.computeIfAbsent(45,(key)->key+" nipun");   //perform only if absent
		System.out.println(map);
		System.out.println(map.containsKey(21));  //it checks whether the key exists or not
		System.out.println(map.containsValue("twelve"));  //it checks whether the value exits or not
		Set<Entry<Integer,String>> set = map.entrySet();  //it gives the set of entry
		System.out.println(set);
		Iterator<Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> e = itr.next();
			System.out.println(e.getKey() + " " +e.getValue());
		}
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(15, "fifteen");
		map1.put(3, "three");
		map1.put(2, "one");
		map1.put(1, "two");
		System.out.println(map.equals(map1));   //it compares two maps
		System.out.println(map.get(12));  //it gives the value of that particular key
		System.out.println(map.getOrDefault(45, "nahi mila")); //it gives the value of that particular key bur if that key is absent then gives the default value
		System.out.println(map.isEmpty());   //it tells whether the map is empty or not
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for(Integer key : keySet) {  //for each loop
			System.out.println(key+" "+map.get(key));
		}
		map.putAll(map1);
		System.out.println(map);   //add more than one pair of element
		map.putIfAbsent(15,"sixteen");  //adds only if not present means it will not replace
		System.out.println(map);
		System.out.println(map.remove(3));  //returns the value of that key and delete it
		System.out.println(map);
		//System.out.println(map.remove(15,"fifteen"));  //check if there pair exists or not if exists then delete
		System.out.println(map);
		map.replace(15, "sixteen");  //if key exists replace the value otherwise do nothing
		System.out.println(map);
		map.replace(2, "one", "four");  //if both key and value exists then replace otherwise not
		System.out.println(map);
		map.replaceAll((key,value)->key>30 ? "nipun" : value);  //replace with the given condition
		System.out.println(map);
		System.out.println(map.size()); //returns the size of map
		Collection<String> val = map.values();  //it returns the collection of values only
		System.out.println(val);
	}
}

package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExz {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(5, "Five");
		map.put(4, "Four");
		map.put(1, "One");
		//map.put(3, "Three");
		map.put(2, "Two");  //add one pair of key and value
		System.out.println(map);
		//The single Key value pair is known as Entity
		System.out.println(map.ceilingEntry(3));  //returns first Entity which is greater than or equal to the key pass
		System.out.println(map.ceilingKey(3));    //returns only first key which is greater than or equal to key passed
		//map.clear();  //it empties the map
		System.out.println(map);
		map.compute(6, (key,value)->key<10? "less than 10": "greater than 10"); //it evaluate the given expression with the key passed if key doesn't exists it will add
		System.out.println(map);
		map.computeIfAbsent(7, (key)-> key<10? "less than equal to 10": "greater than 10");  //it will add the expression after evaluated if absent
		System.out.println(map);
		map.computeIfPresent(1,(key,value)->key<10? "less than 10": "greater than 10");  //it evaluates the given expression and override only if present
		System.out.println(map);
		System.out.println(map.containsKey(5));  //it tells whether key exists or not
		System.out.println(map.containsValue("Two"));  //it tells whether value is there in map or not
		Set<Integer> set = map.descendingKeySet(); // it returns the set of key in descending order
		System.out.println(set);
		NavigableMap<Integer,String> map1 = map.descendingMap();  //it returns the map in descending order
		System.out.println(map1);
		Set<Entry<Integer,String>> entrySet = map.entrySet();  //it returns the set of entity
		System.out.println(entrySet);
		for(Entry<Integer,String> e : entrySet) {
			System.out.println(e);
		}
		System.out.println(map.equals(map1));  //it compares two map
		Entry<Integer,String> e = map.firstEntry();   //it returns the first entry
		System.out.println(e);
		System.out.println(map.firstKey());   //it returns the first key
		
 		System.out.println(map.floorEntry(3));  //reverse of ceilingEntry returns first entry less than or equal to the key passed
 		System.out.println(map.floorKey(3));  //reverse of ceilingKey returns first key less than or equal to key passed
 		System.out.println(map.get(2));  // return the value of the given key
 		System.out.println(map.getOrDefault(3, "nahi mila"));  //it returns the value of given key if exists or returns the default value
 		System.out.println(map.headMap(4));  //it returns map from starting till the given key but given key is excluded
 		System.out.println(map.headMap(4,true));  //it returns map from starting till the given key but given key is included depending upon boolean value passed
 		System.out.println(map.higherEntry(4));  //it returns the first entity greater than the key passed
 		System.out.println(map.higherKey(4));  //it returns the first key greater than the key passed
 		System.out.println(map.isEmpty());  //it tells whether the map is empty or not
 		
 		map.put(2, null);
 		System.out.println(map);
 		Set<Integer>keySet = map.keySet();  //it returns the set of keys
 		System.out.println(keySet);
 		System.out.println(map.lastEntry());  //it returns the last entry (key,value pair);
 		System.out.println(map.lastKey());   //returns the last key
 		System.out.println(map.lowerEntry(4)); //returns the first entry lower than key passed
 		System.out.println(map.lowerKey(4));   //returns the first key lower than the key passed
 		NavigableSet<Integer> navigableSet = map.navigableKeySet();  //reeturns the navigable set of keys
 		System.out.println(navigableSet);
 		System.out.println(map.pollFirstEntry());  //it returns the first entry and removes it
 		
 		System.out.println(map);
 		System.out.println(map.pollLastEntry());  //it returns the last entry and removes it
 		System.out.println(map);
 		Map<Integer,String> map2 = new HashMap<>();
 		map2.put(9, "Nine");
 		map2.put(10,"Ten");
 		map.putAll(map2);  //add multiple values together thru another map
 		System.out.println(map);
 		map.putIfAbsent(3, "Fourteen");  //add only if not absent no replacement
 		System.out.println(map);
 		map.remove(3);  //removes particular entity of key passed
 		System.out.println(map);
 		map.remove(2,null);  //removes only if key and value matches
 		System.out.println(map);
 		map.replace(6, "six");  //replaces the given key with value
 		System.out.println(map);
 		map.replace(10, "Ten", "tenn");  // it will match first key and value if matches then replace
 		
 		System.out.println(map);
 		map.replaceAll((key,value)->(key<5)? "Less than 5":"greater than 5"); //it replace all the values according to the expression passed
 		System.out.println(map);
 		System.out.println(map.size());  //it returns the size
 		System.out.println(map.values());  //it returns the collection of values
 		Map<Integer,String> map3 = map.subMap(5, 9);  //returns map of from key to to key, from key is included and to key is excluded
 		System.out.println(map3);
 		Map<Integer,String> map4 = map.subMap(5, false, 9, true); //returns map of from key to to key, from key is included depends on boolean value and to key is excluded depending upon the boolean value
 		System.out.println(map4);
 		Map<Integer,String> map5 = map.tailMap(5);  //returns map from key passed to last one
 		System.out.println(map5);
 		Map<Integer,String> map6 = map.tailMap(5,false);  //returns map from key passed to last one  and key passed is included or not depends on boolean value
 		System.out.println(map6);
 		
 		
 	}
}

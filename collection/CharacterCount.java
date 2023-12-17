package collection;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * Program to  counts the no of occurence of the character in a particular string 
 *
 */
public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String s = sc.next();
		TreeMap<Character,Integer> map = new TreeMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
//		Set<Entry<Character,Integer>> set  = map.entrySet();
//		for(Entry<Character,Integer> e : set) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
		
//		Set<Character> keySet = map.keySet();
//		for(Character key : keySet) {
//			System.out.println(key+ " "+map.get(key));
//		}
		System.out.println(map);
	}

}

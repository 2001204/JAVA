package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Collectionexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			}else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
	}
}

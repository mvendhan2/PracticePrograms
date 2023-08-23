package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;

public class uniqueelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ababcbdedaga";
		char str[] = str1.toCharArray();
		int count =0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>(str.length);
		for(char ch:str) {
			if(map.containsKey(ch)) {
				count = map.get(ch);
				map.put(ch,count+1);
			}else {
				map.put(ch,1);
			}
		}
		
		for(Entry<Character,Integer>entry:map.entrySet()) {
			if(entry.getValue() == 1)
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

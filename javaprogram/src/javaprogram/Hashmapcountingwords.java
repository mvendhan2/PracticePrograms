package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import java.util.HashMap;

public class Hashmapcountingwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "big black bug bit a big black dog on his big black nose";
		String[] str1 = str.split(" ");
		int count = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for(String s:str1) {
			if(map.containsKey(s)) {
				count = map.get(s);
				map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
		}
		for(Entry<String,Integer> entry: map.entrySet()){
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}


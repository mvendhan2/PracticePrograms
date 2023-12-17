package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;

public class repeated_count_for_int_in_hasmap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,1,5};
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(Integer i:arr) {
			if(map.containsKey(i)) {
				count = map.get(i);
				map.put(i, count+1);
			}else {
				map.put(i, 1);
			}
		}
		for(Entry<Integer,Integer> entry: map.entrySet()){
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}

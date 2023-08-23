package javaprogram;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesInIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] obj = new int[] {1, 2,2,2,2, 3, 4, 2, 7, 8, 8, 3, 3};
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0;i<obj.length;i++) {
			for(int j=i+1;j<obj.length;j++) {
				
					if(obj[i]==obj[j]) {
						s.add(obj[j]);
					}
			}
		}
		
		System.out.println(s);		
	}

}

package javaprogram;

import java.util.Arrays;

public class removeduplicateschar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="zooho";
		char[] a = str.toCharArray();
		int i,j = 0,index=0;
		for( i=0;i<a.length;i++) {
			for( j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					break;
				}
				
			}
			if(i==j) {
				a[index++] = a[i];
			}
		}
		
		
		System.out.println(String.valueOf(Arrays.copyOf(a, index)));
	}

}

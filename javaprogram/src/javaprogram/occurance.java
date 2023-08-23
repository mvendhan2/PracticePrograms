package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "CORPORATION";
		char chararr[] = str.toCharArray();
		int size, temp,temp1;
		size = chararr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (chararr[i] > chararr[j]) {
					temp = chararr[i];
					chararr[i] = chararr[j];
					chararr[j] = (char) temp;
				}
			}
		}
		String s = new String(chararr);
		System.out.println(s);
		
	}

}

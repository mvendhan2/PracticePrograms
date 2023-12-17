package javaprogram;

import java.util.HashSet;
import java.util.Set;

public class arryaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 7, 8, 9 };
		int temp = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] != arr2[j])
					s.add(arr1[i]);
			}
		}
		for (int i : s) {
			System.out.println(i);
		}
	}

}

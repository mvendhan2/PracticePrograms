package javaprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hastset_using_removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "mullai";
	char[] str = a.toCharArray();
		HashSet<Character> hs = new LinkedHashSet<>(a.length()-1);
		for(char c:str) {
			hs.add(c);
		}
		for(char c:hs) {
			System.out.println(c);
			
		}
	}

}

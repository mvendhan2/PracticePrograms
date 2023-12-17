package javaprogram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Stringvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s1 = "EY";
//		String s2 = "EY";
//		System.out.println(s1==s2);
//		String s3 = new String("EY");
//		String s4 = new String("1EY");
//		System.out.println(s1.equals(s4));
//		
//		

//		String str = "Mullai";
//		System.out.println(str.substring(0,3));

//		String str = "Mullai";
//		 StringBuilder input1 = new StringBuilder();
//		 input1.append(str);
//		 
//		System.out.println(input1.reverse());

//		String str = "Mullai";
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}

//		String str = "Mullai vendhan";
//		String[] splitStr = str.split(" ");
//		for(int i = 0 ; i<splitStr.length; i++) {
//			String newStr = splitStr[i];
//			for(int j=newStr.length()-1;j>=0;j--) {
//				System.out.print(newStr.charAt(j));
//			}
//			System.out.print(" ");
//		}
//		String newstr = splitStr[1];
//		for(int i=newstr.length()-1;i>=0;i--) {
//			System.out.print(newstr.charAt(i));
//		}

//		String str = "Big Bung Bug Big big big big bug";
//		String strLowercase = str.toLowerCase();
//		String[] strsplit = strLowercase.split(" ");
//		String returnvalue = null;
//		int count = 0;
//		for (int i = 0; i < strsplit.length; i++) {
//			count = 1;
//			if (strsplit[i] != null) {
//				for (int j = i + 1; j < strsplit.length; j++) {
//
//					if (strsplit[i].equals(strsplit[j])) {
//
//						returnvalue = strsplit[i];
//						count++;
//						strsplit[j] = null;
//					}
//				}
//
//			}
//			
//			if(count>=1 && strsplit[i]!=null) {
//				System.out.println("word is: "+strsplit[i]+ " count: "+count);
//			}
//
//		}

//		HashMap<String,Integer> map = new HashMap<>();
//		for(String s:strsplit) {
//			if(map.containsKey(s)) {
//				count = map.get(s);
//				map.put(s, count+1);//1110001 - 4			
//				}else {
//					map.put(s, 1);
//			
//		}
//		}
//		
//		
//		for(Entry<String,Integer>entry:map.entrySet()) {
//			
//			if(entry.getValue() == 1) {
//				System.out.println(entry.getKey());
//			}
//			
//			
//		}

		String str = "zoho";
		char[] ch = str.toCharArray();
		char c;
		Arrays.sort(ch);
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if (ch[i] != 0) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						c = ch[i];
						count++;
						ch[j] = 0;
					}
				}
			}

			if (count == 1 && ch[i] != 0) {
				System.out.println(ch[i] + " " + count);
				
			}
		}

	}

}

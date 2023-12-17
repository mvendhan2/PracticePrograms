package LeetCode;
/*
 * 1071. Greatest Common Divisor of Strings
 * 
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
 
 */

public class GreatestCommonDivisorOfStrings {
	
	public static String findGCD(String str1, String str2) {
        if (str2.isEmpty()) {
            return str1;
        }

        if (str1.length() < str2.length()) {
            return findGCD(str2, str1);
        }

        if (str1.startsWith(str2)) {
            return findGCD(str1.substring(str2.length()), str2);
        }

        return "";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABCABC";
        String str2 = "ABC";

        String gcd = findGCD(str1, str2);
        System.out.println("GCD of Strings: " + gcd);
		
//		if(str1.equals(str2)) {
//			System.out.println(str1);
//		}
//		
//		if(str1.startsWith(str2)) {
//			if(str1.substring(str2.length()).equals(str2)) {
//				System.out.println(str1.substring(str2.length()));
//			}
//		}
//		
//		if(str2.startsWith(str1)) {
//			if(str1.equals(str2.substring(str1.length()))) {
//				System.out.println(str2.substring(str1.length()));
//			}
//		}
		
//		 if (!(str1 + str2).equals(str2 + str1))
//			 System.out.println("empty");
	     

//	        int a = str1.length();
//	        int b = str2.length();
//	        if(a > b  ) {
//	        	System.out.println(str1.substring(b));
//	        }else if(b > a){
//	        	System.out.println(str1.substring(a));
//	        }else {
//	        	 System.out.println("empty");
//	        }

//	        while (b != 0) {
//	            int x = a;
//	            a = b;
//	            b = x % b;
//	        }
//	        System.out.println(str1.substring(0, a));
	      
	    }
		

	}


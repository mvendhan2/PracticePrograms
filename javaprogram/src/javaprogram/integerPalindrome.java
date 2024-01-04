package javaprogram;

import java.util.Scanner;

public class integerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 232;
		int copynum = a;
		int lastNum = 0;
		int reverseNum = 0;
		while (a > 0) {
			lastNum = a % 10;
			reverseNum = (reverseNum * 10) + lastNum;
			a = a / 10;
		}
		if(copynum == reverseNum) 
			System.out.println("palindrome");
		else
			System.out.println("Non palindrome");
	}

}

package javaprogram;

import java.util.Scanner;

public class Vowelpresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		String str1 = str.toLowerCase();
			if(str1.matches(".*[aeiou]*.")) {
				System.out.println("pass");
			}else {
				System.out.println("Fail");
			}
	}

}

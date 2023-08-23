package javaprogram;

public class reversethestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "qapitol qa";
		char[] str1 = str.toCharArray();
		for(int i=str1.length - 1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
